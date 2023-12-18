function main(){
  var i = 0;
  while(true){
    var fieldInfo = input[i].split(' ');
    var width = fieldInfo[0] - 0;//toInt
    var height = fieldInfo[1] - 0;//toInt
  
    // 0 0が入力された
    if(width == 0 && height == 0){
      break;
    }
  
    var start;
    var goal;
    var elem = [[],[],[],[],[]];
    for(var ei = 0;ei < 5; ei++){
      elem[ei].length = 0;
    }
      
    for(var y = 0; y < height; y++){
      i++;//1行進める
      for(var x = 0; x < width; x++){
        var c = input[i][x];
  
        switch(c){
        case 'S':
          start = pos(x, y);
          break;
        case 'G':
          goal = pos(x, y);
          break;
        case '.':
          break;
        default : // 入力値が正しいので、絶対に属性
          elem[c - 1][elem[c - 1].length] = pos(x, y);
          break;
        }
      }
    }
  
      
    var bestElement = -1;
    var distance = Infinity;
      
    // 属性ごとにループ
    for (var startElem = 0; startElem < 5; startElem++) {
      // DPの初期化 DP[属性][同じ属性内の連番]
      var dp = [[],[],[],[],[]];
      for(var h = 0; h < 5; h++){
        var hLength = elem[h].length;
        dp[h].length = hLength;
        for(var hidx = 0; hidx < hLength; hidx++){
          dp[h][hidx] = Infinity;
        }
      }
        
      // 最初に選んだパチモンから次に捕まえられる属性番号
      var first = (startElem + 1) >= 5 ? startElem - 4 : startElem + 1;
  
      var firstLength = elem[first].length;
      for (var j = 0; j < firstLength; j++) {
        // s→e1を計算
        dp[first][j] = dist(start, elem[first][j]);
      }
        
      // s->1->2->3->4->g
      // なので、ループは間の-> * 3分まわす
      for (var e = 0; e < 3; e++) {
        // ex->e(x+1)
        var now = (first + e) >= 5 ? (first + e) - 5 : first + e;
        var next = (now + 1) == 5 ? now - 4 : now + 1;
        var nowLength = elem[now].length;
        var nextLength = elem[next].length;
        for (var j = 0; j < nowLength; j++) {
          for (var k = 0; k < nextLength; k++) {
            var d = dist(elem[now][j], elem[next][k]);
            if(d > dp[next][k])
              continue;
            
            dp[next][k] = min(dp[next][k], dp[now][j] + d);
          }
        }
      }
        
      var last = (first + 3) % 5;
      var lastLength = elem[last].length;
      for (var j = 0; j < lastLength; j++) {
        // e4->g
        var d = dp[last][j] + 
                    dist(elem[last][j], goal);
          
        if (d < distance) {
          distance = d;
          bestElement = startElem + 1;
        }
          
      }
        
    }
      
    if (distance == Infinity) {
      console.log("NA");
    } else {
      console.log(bestElement + " " + distance);
    }
  
    i++;
  }
  
}
  
function dist(from, to){
  return fabs((from >> 11) - (to >> 11)) + fabs((from & 2047) - (to & 2047));
}

function min(a1, a2){
  return a1 > a2 ? a2 : a1;
}
  
function pos(a, b){
  // 2^10 = 1024なので、下位10ビットでy座標を、上位ビットでx座標を表す
  return (a << 11) + b;
}
 
function fabs(a){
 return (a ^ (a >> 31)) - (a >> 31);
}
  
var
input = '';
  
process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
  input += chunk;
});
process.stdin.on('end', function() {
  input = input.split('\n');
  main();
});
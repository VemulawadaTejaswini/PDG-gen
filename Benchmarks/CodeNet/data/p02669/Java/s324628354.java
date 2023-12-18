function Main(input) {
  input = input.replace(/\n/g, ' ');
  input = input.split(" ");
  var A = input[0];
  input.shift();
  for(var i=0;i<A;i++){
    var n = input[i*5];
    var a = input[i*5+1];
    var b = input[i*5+2];
    var c = input[i*5+3];
    var d = input[i*5*4];
    var ans = d;
    var coin = [];
    coin[1] = d;
    console.log(ans);
  }
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
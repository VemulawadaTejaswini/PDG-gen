//import java.io.File;
import java.util.Scanner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Main{
  static int[] sosu = new int[100000];
  static int sosuIte = 4, sosuMax = 11;
  static HashSet<Integer> fastSosu;
  static HashMap<Integer,Integer> dp; //<caveNum,answer>
  static int maxNumber; //cave????????°
  //static int maxAnswerCave; //?§£??¨??????cave?????????
  static int maxAnswerNumber; //?§£??¨????????°
  static HashMap<Integer,Integer> maxAnswerCaveMap;

  public static void main(String[] args) throws Exception {
    sosu[0] = 2;  sosu[1] = 3;  sosu[2] = 5;  sosu[3] = 7;
    fastSosu = new HashSet<>(100000);
    fastSosu.add(2);fastSosu.add(3);fastSosu.add(5);fastSosu.add(7);

    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    int input1 = scan.nextInt();
    int input2 = scan.nextInt();

    while(!(input1==0&&input2==0)) {
      //System.out.print(input2+" ");
      dp = new HashMap<>();
      maxAnswerCaveMap = new HashMap<>();
      maxNumber = input1;
      //maxAnswerCave = 0;
      calcSosu(input1);

      System.out.print(getCount(input2));
      int dummy = maxAnswerCaveMap.get(input2);
      System.out.println(" "+(dummy!=-1?dummy:0));

/*
      for(Map.Entry<Integer,Integer> entry : dp.entrySet()) {
        System.out.println(entry.getKey()+","+entry.getValue());
      }
      */
/*
            for(Map.Entry<Integer,Integer> entry : maxAnswerCaveMap.entrySet()) {
              System.out.println(entry.getKey()+","+entry.getValue());
            }
            */



      input1 = scan.nextInt();
      input2 = scan.nextInt();
    }
    //System.out.println(sosuIte);

/*
    for(int i = 0; i < 100; i++) {
      Set io = getPos(i+1);
      if(getNum(io.x,io.y)!= i+1) System.out.println(io.x+","+io.y+" : "+getNum(io.x,io.y));
    }
*/

  }

  static int getCount(int _number) {
    //System.out.println(_number);
    if(_number > maxNumber) {
      return 0;
    }

    int rd=0,d=0,ld=0; //??????????????????

    if(dp.containsKey(_number)) {
      //System.out.println("dp:"+_number);
      return dp.get(_number);
    }

    Set inset = getPos(_number);  //????????´???
    //?????????
    int rdN = getNum(inset.x+1,inset.y+1);
    rd = getCount(rdN);
    int dN = getNum(inset.x,inset.y+1);
    d = getCount(dN);
    int ldN = getNum(inset.x-1,inset.y+1);
    ld = getCount(ldN);



    //??§??????caveNo???hashmap???????´?
    int max = 0;
    int maxCave = 0;
    int rdC = maxAnswerCaveMap.containsKey(rdN)?maxAnswerCaveMap.get(rdN):-1;
    int dC = maxAnswerCaveMap.containsKey(dN)?maxAnswerCaveMap.get(dN):-1;
    int ldC = maxAnswerCaveMap.containsKey(ldN)?maxAnswerCaveMap.get(ldN):-1;
    if(rd>d&&rd>ld) {
      max = rd;
      maxCave = rdC;
    }else if(d>rd&&d>ld) {
      max = d;
      maxCave = dC;
    }else if(ld>rd&&ld>d) {
      max = ld;
      maxCave = ldC;
    }else if(rd==d&&d==ld) {
      max = rd;
      maxCave = Math.max(rdC,Math.max(dC,ldC));
    }else if(rd==d) {
      max = rd;
      maxCave = rdC>dC?rdC:dC;
    }else if(d==ld) {
      max = d;
      maxCave = dC>ldC?dC:ldC;
    }else {
      max = rd;
      maxCave = rdC>ldC?rdC:ldC;
    }


    boolean flag = fastSosu.contains(_number);
    if(flag && maxCave == -1) {
      maxCave = _number;
    }
    maxAnswerCaveMap.put(_number,maxCave);
    int answer = max + (flag?1:0);
    //if(_number == 15 || _number == 5) System.out.println(_number+":"+answer+",("+rd+","+d+","+ld+")");
    //System.out.println(_number+":"+answer+",("+rd+","+d+","+ld+")");
    //System.out.print(answer+",");
    dp.put(_number,answer);
    return answer;
  }

  static void calcSosu(int _max) {
    NOT_SOSU: for(int i = sosuMax; i <= _max; i++) {
      sosuMax++;
      if(i%2==0||i%3==0||i%5==0||i%7==0) continue;
      for(int j = 0; j < sosuIte; j++) {
        if(i<sosu[j]*sosu[j]) break;
        if(i%sosu[j]==0) continue NOT_SOSU;
      }
      //System.out.println("prime!!"+sosuIte+":"+i);
      sosu[sosuIte] = i;
      sosuIte++;
      fastSosu.add(i);
    }
  }

  //?????????1
  static int getNum(int _x, int _y) {
    int dummyX = _x>0?_x:-_x;
    int dummyY = _y>0?_y:-_y;
    int inRect = dummyX>dummyY?dummyX:dummyY;

    if(_x==inRect&&_y<inRect) {
      return (inRect*2-1)*(inRect*2-1)+(_y-inRect)*-1;
    }else if(_y==-inRect&&_x<inRect) {
      return (inRect*2-1)*(inRect*2-1)+inRect*2+(_x-inRect)*-1;
    }else if(_x==-inRect&&_y>-inRect) {
      return (inRect*2-1)*(inRect*2-1)+inRect*4+_y+inRect;
    }else if(_y==inRect&&_x>-inRect) {
      return (inRect*2-1)*(inRect*2-1)+inRect*6+_x+inRect;
    }else return 1;
  }

  //?????????0,0
  static Set getPos(int _num) {
    if(_num==1) return new Set(0,0);
    int inRect = (1+(int)Math.sqrt(_num-1))/2;
    int index = (_num-(inRect*2-1)*(inRect*2-1)-1);
    int fourPart = index/(inRect*2);
    index %= (inRect*2);

    //System.out.print("num:"+_num+",inRect:"+inRect+",");

    int rx=0,ry=0;
    switch(fourPart) {
      case 0:
        rx = inRect;
        ry = inRect-1-index;
        break;
      case 1:
        rx = inRect-1-index;
        ry = -inRect;
        break;
      case 2:
        rx = -inRect;
        ry = -inRect+1+index;
        break;
      case 3:
        rx = -inRect+1+index;
        ry = inRect;
        break;
    }

    //System.out.print("("+rx+","+ry+")");
    return new Set(rx,ry);
  }
}


class Set{
  int x,y;
  Set(int _x, int _y) {
    this.x = _x;
    this.y = _y;
  }
}
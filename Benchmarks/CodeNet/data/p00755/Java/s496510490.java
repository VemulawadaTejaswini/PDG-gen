//import java.io.File;
import java.util.Scanner;

import java.util.Arrays;

import java.io.PrintWriter;

class Main {
  static int[][] arr;
  static boolean[][] checkedArray;
  static int w,h,lastInput;
  static int[] prime = {0,2,3,5,7,11,13};
  static int max;
  //static PrintWriter fos;
  public static void main(String[] args) {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);
    //fos = new PrintWriter(new File("out.txt"));
    h = scan.nextInt();
    w = scan.nextInt();
    lastInput = scan.nextInt();
while(!(h==0||w==0||lastInput==0)) {
  max = 0;

    arr = new int[h][w];
    checkedArray = new boolean[h][w];
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        arr[i][j] = scan.nextInt();
      }
    }

    calcOneThing(0, arr);

    System.out.println(max);
    //fos.close();

h = scan.nextInt();
w = scan.nextInt();
lastInput = scan.nextInt();
}
  }

  static void calcOneThing(int _count, int[][] _arr) {
    //System.out.println(Arrays.deepToString(_arr));
    if(_count>=5) {
      int _max = calcMax(0,0,_arr,new boolean[h][w],0);
      if(_max>max) {
        max = _max;
        //System.out.println("----newrecord----");
      }
      return;
    }
    boolean[][] nextCheckArray = cloneBooleanArray(checkedArray);
    int nextCheck = checkNextPanel(_arr[0][0],0,0,_arr,nextCheckArray,1);
    boolean flag = false;
    for(int i = 1; i <= 6; i++) {
      if(nextCheck % prime[i] == 0 || (_count == 4 && i == lastInput)) {
        int[][] nextArr = cloneIntArray(_arr);
        boolean[][] dummyChecked = cloneBooleanArray(checkedArray);
        changeNextPanel(i,0,0,nextArr,dummyChecked);
        //System.out.print("count : "+_count+" , color = "+ i);
        calcOneThing(_count+1,nextArr);
        flag = true;
      }
    }
    if(!flag) {
      if(_arr[0][0] != lastInput) {
        int[][] nextArr = cloneIntArray(_arr);
        boolean[][] dummyChecked = cloneBooleanArray(checkedArray);
        changeNextPanel(lastInput,0,0,nextArr,dummyChecked);
        //System.out.print("[re]count : "+_count+" , color = "+ lastInput);
        calcOneThing(_count+1,nextArr);
      }else {
        int _max = calcMax(0,0,_arr,new boolean[h][w],0);
        if(_max>max) {
          max = _max;
          //System.out.println("----newrecord----");
        }
      }
    }
  }

  static int calcMax(int _x, int _y, int[][] map, boolean[][] checked, int num) {
    if(checked[_x][_y]) return num;
    checked[_x][_y] = true;
    if(_x>0) {
      if(map[_x-1][_y] == map[_x][_y]) num = calcMax(_x-1,_y,map,checked,num);
    }
    if(_x<h-1) {
      if(map[_x+1][_y] == map[_x][_y]) num = calcMax(_x+1,_y,map,checked,num);
    }
    if(_y>0) {
      if(map[_x][_y-1] == map[_x][_y]) num = calcMax(_x,_y-1,map,checked,num);
    }
    if(_y<w-1) {
      if(map[_x][_y+1] == map[_x][_y]) num = calcMax(_x,_y+1,map,checked,num);
    }
    return num+((map[_x][_y]==lastInput)?1:0);
  }

  //next to no panel wo sagasu.
  static int checkNextPanel(int _my, int _x, int _y, int[][] map, boolean[][] checked ,int num) {
    if(checked[_x][_y]) return num;
    checked[_x][_y] = true;
    if(_x>0) {
      if(map[_x-1][_y] == _my) num = checkNextPanel(_my,_x-1,_y,map,checked,num);
      else if(num % prime[map[_x-1][_y]] != 0) num *= prime[map[_x-1][_y]];
    }
    if(_x<h-1) {
      if(map[_x+1][_y] == _my) num = checkNextPanel(_my,_x+1,_y,map,checked,num);
      else if(num % prime[map[_x+1][_y]] != 0) num *= prime[map[_x+1][_y]];
    }
    if(_y>0) {
      if(map[_x][_y-1] == _my) num = checkNextPanel(_my,_x,_y-1,map,checked,num);
      else if(num % prime[map[_x][_y-1]] != 0) num *= prime[map[_x][_y-1]];
    }
    if(_y<w-1) {
      if(map[_x][_y+1] == _my) num = checkNextPanel(_my,_x,_y+1,map,checked,num);
      else if(num % prime[map[_x][_y+1]] != 0) num *= prime[map[_x][_y+1]];
    }
    //System.out.print(num+",");
    return num;
  }

  //zissai ni kaeru.
  static void changeNextPanel(int _my, int _x, int _y, int[][] map, boolean[][] checked) {
    if(checked[_x][_y]) return;
    checked[_x][_y] = true;
    if(_x>0) {
      if(map[_x-1][_y] == map[_x][_y]) {
        changeNextPanel(_my,_x-1,_y,map,checked);
      }
    }
    if(_x<h-1) {
      if(map[_x+1][_y] == map[_x][_y]) {
        changeNextPanel(_my,_x+1,_y,map,checked);
      }
    }
    if(_y>0) {
      if(map[_x][_y-1] == map[_x][_y]) {
        changeNextPanel(_my,_x,_y-1,map,checked);
      }
    }
    if(_y<w-1) {
      if(map[_x][_y+1] == map[_x][_y]) {
        changeNextPanel(_my,_x,_y+1,map,checked);
      }
    }
    map[_x][_y] = _my;
  }

  static int[][] cloneIntArray(int[][] _arr) {
    int[][] dummy = new int[_arr.length][];
    for(int i = 0; i < _arr.length; i++) {
      dummy[i] = new int[_arr[i].length];
      for(int j = 0; j < dummy[i].length; j++) {
        dummy[i][j] = _arr[i][j];
      }
    }
    return dummy;
  }

  static boolean[][] cloneBooleanArray(boolean[][] _arr) {
    boolean[][] dummy = new boolean[_arr.length][];
    for(int i = 0; i < _arr.length; i++) {
      dummy[i] = new boolean[_arr[i].length];
      for(int j = 0; j < dummy[i].length; j++) {
        dummy[i][j] = _arr[i][j];
      }
    }
    return dummy;
  }
}
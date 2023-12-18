import java.util.*;

class Main{
  static boolean[][] wall = new boolean[9][];
  static int[] point = {0,0,0};

  public static boolean[] lineSet(String str){
    boolean[] line = new boolean[str.length()];
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '0') {
        line[i] = false;
      }
      else {
        line[i] = true;
      }
    }
    return line;
  }

  public static void moveR(){
    System.out.print("R");
    point[1]++;
    point[2] = 0;
  }
  
  public static void moveD(){
    System.out.print("D");
    point[0] += 2;
    point[2] = 1;
  }
  
  public static void moveL(){
    System.out.print("L");
    point[1]--;
    point[2] = 2;
  }
  
  public static void moveU(){
    System.out.print("U");
    point[0] -= 2;
    point[2] = 3;
  }
  
  public static void directionR(){
    if (point[0] > 0 && wall[point[0]-1][point[1]]) {
      moveU();
    }
    else if (point[1] < 4 && wall[point[0]][point[1]]) {
      moveR();
    }
    else if (point[0] < 8 && wall[point[0]+1][point[1]]) {
      moveD();
    }
    else {
      moveL();
    }
  }
  public static void directionD(){
    if (point[1] < 4 && wall[point[0]][point[1]]) {
      moveR();
    }
    else if (point[0] < 8 && wall[point[0]+1][point[1]]) {
      moveD();
    }
    else if (point[1] > 0 && wall[point[0]][point[1]-1]) {
      moveL();
    }
    else {
      moveU();
    }
  }
  public static void directionL(){
    if (point[0] < 8 && wall[point[0]+1][point[1]]) {
      moveD();
    }
    else if (point[1] > 0 && wall[point[0]][point[1]-1]) {
      moveL();
    }
    else if (point[0] > 0 && wall[point[0]-1][point[1]]) {
      moveU();
    }
    else {
      moveR();
    }
  }
  public static void directionU(){
    if (point[1] > 0 && wall[point[0]][point[1]-1]) {
      moveL();
    }
    else if (point[0] > 0 && wall[point[0]-1][point[1]]) {
      moveU();
    }
    else if (point[1] < 4 && wall[point[0]][point[1]]) {
      moveR();
    }
    else {
      moveD();
    }
  }

  public static void direction(){
    switch(point[2]) {
      case 0:
        directionR();
        break;
      case 1:
        directionD();
        break;
      case 2:
        directionL();
        break;
      case 3:
        directionU();
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 9; i++) {
      String str = sc.next();
      wall[i] = lineSet(str);
    }
    while(true) {
      direction();
      if (point[0] == 0 && point[1] == 0) {
        break;
      }
    }
    System.out.println("");
  }
}
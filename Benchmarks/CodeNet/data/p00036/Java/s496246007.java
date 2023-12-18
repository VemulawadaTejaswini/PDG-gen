import java.util.Scanner;

class Main {

  public static String solve(String[] data) {
    for(int i=0; i<8; i++) {
      for(int j=0; j<8; j++) {
        if(data[i].charAt(j)=='0') {
          continue;
        }
        if(i<7&&j<7) {
          if(data[i+1].charAt(j)=='1' && data[i].charAt(j+1)=='1' && data[i+1].charAt(j+1)=='1') {
            return "A";
          }
        }
        if(i<5) {
          if(data[i+1].charAt(j)=='1' && data[i+2].charAt(j)=='1' && data[i+3].charAt(j)=='1') {
            return "B";
          }
        }
        if(j<5) {
          if(data[i].charAt(j+1)=='1' && data[i].charAt(j+2)=='1' && data[i].charAt(j+3)=='1') {
            return "C";
          }
        }
        if(i<6&&0<j) {
          if(data[i+1].charAt(j)=='1' && data[i+1].charAt(j-1)=='1' && data[i+2].charAt(j-1)=='1') {
            return "D";
          }
        }
        if(i<7&&j<6) {
          if(data[i].charAt(j+1)=='1' && data[i+1].charAt(j+1)=='1' && data[i+1].charAt(j+2)=='1') {
            return "E";
          }
        }
        if(i<6&&j<7) {
          if(data[i+1].charAt(j)=='1' && data[i+1].charAt(j+1)=='1' && data[i+2].charAt(j+1)=='1') {
            return "F";
          }
        }
        return "G";
      }
    }
    return "a";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] data = new String[8];
    for(int i=0; i<8; i++) {
      data[i] = sc.nextLine();
    }
    System.out.println(solve(data));
    while(sc.hasNext()) {
      String nl = sc.nextLine();
      for(int i=0; i<8; i++) {
        data[i] = sc.nextLine();
      }
      System.out.println(solve(data));
    }
  }
}
import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int i = 0;
    String st = "0";
    int ac = 0;
    int wa = 0;
    int tle = 0;
    int re = 0;
    while(i<=n){
      st = scanner.nextLine();
      if(st.equals("AC")){
        ac = ac + 1;
      };
      if(st.equals("WA")){
        wa = wa + 1;
      }
      if(st.equals("TLE")){
        tle = tle +1;
      }
      if(st.equals("RE")){
        re = re + 1;
      }
      i++;
    }
    System.out.println("AC x " + ac);
    System.out.println("WA x " + wa);
    System.out.println("TLE x " + tle);
    System.out.println("RE x " + re);
  };
};
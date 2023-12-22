import java.util.*;
public class Main {
  	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String a[] = new String[N];
      int AC = 0;
      int WA = 0;
      int TLE = 0;
      int RE = 0;
      for (int count = 0; count < N; count++){
  	    a[count] = sc.next();
        if (a[count].equals("AC")){
          AC++;
        } else if (a[count].equals("WA")){
          WA++;
        } else if (a[count].equals("TLE")){
          TLE++;
        } else {
          RE++;
        }
      }
      System.out.println("AC x " + AC);
      System.out.println("WA x " + WA);
      System.out.println("TLE x " + TLE);
      System.out.println("RE x " + RE);
    }
}
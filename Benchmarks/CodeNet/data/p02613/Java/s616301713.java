import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String[n];
    for(int i=0 ; i<n ; i++){
      s[i] = sc.next();
    }
    int countAC = 0;
    int countWA = 0;
    int countTLE = 0;
    int countRE = 0;

    for(int i=0 ; i<n ; i++){
      if(s[i].equals("AC")){
        countAC++;
      }else if(s[i].equals("WA")){
        countWA++;
      }else if(s[i].equals("TLE")){
        countTLE++;
      }else{
        countRE++;
      }
    }
    System.out.println("AC x " + countAC);
    System.out.println("WA x " + countWA);
    System.out.println("TLE x " + countTLE);
    System.out.println("RE x " + countRE);
  }
}

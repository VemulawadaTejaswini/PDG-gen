import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ac = 0;
    int wa = 0;
    int tle = 0;
    int re = 0;
    for(int i = 1;i <= N;i++){
      String S = sc.nextLine();
      if(S =="AC") ac++;
      else if(S=="WA") wa++;
      else if(S=="TLE") tle++;
      else re++;
    }
  System.out.println("AC x "+ac);
  System.out.println("WA x "+wa);
  System.out.println("TLE x "+tle);
  System.out.println("RE x "+re);
  }
}
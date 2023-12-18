import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    int s0 = 0;
    int s1 = 0;
    int s2 = 0;
    int s3 = 0;
    for (int i = 0; i < n; i++){
      string S = scan.next();
      if (S == "AC"){
        s0++;
      }else if (S == "WA"){
        s1++;
      }else if (S == "TLE"){
        s2++;
      }else if (S == "RE"){
        s3++;
      }
    }
  System.out.println("AC"+" "+"x"+" "+c0);
  System.out.println("WA"+" "+"x"+" "+c1);
  System.out.println("TLE"+" "+"x"+" "+c2);
  System.out.println("RE"+" "+"x"+" "+c3);
  }
}

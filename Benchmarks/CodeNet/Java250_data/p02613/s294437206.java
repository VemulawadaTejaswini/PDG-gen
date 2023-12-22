import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int c0 = 0;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    for (int i = 0; i < n; i++){
      String S = scan.next();
      if (S.equals("AC")){
        c0 += 1;
      }else if (S.equals("WA")){
        c1 += 1;
      }else if (S.equals("TLE")){
        c2 += 1;
      }else if (S.equals("RE")){
        c3 += 1;
      }
    }
    System.out.println("AC"+" "+"x"+" "+c0);
    System.out.println("WA"+" "+"x"+" "+c1);
    System.out.println("TLE"+" "+"x"+" "+c2);
    System.out.println("RE"+" "+"x"+" "+c3);
  }
}
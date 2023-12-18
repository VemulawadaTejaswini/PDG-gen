import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    String s = sc.next();
    String ans;

    if(a >= 3200)	ans = s;
    else	ans = "red";

    System.out.print(ans);


  }
}
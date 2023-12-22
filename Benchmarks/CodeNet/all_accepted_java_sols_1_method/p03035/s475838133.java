import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A,B,ans;
    A = sc.nextInt();
    B = sc.nextInt();
    if(A>=13)
      ans = B;
    else if((A>=6)&&(A<=12))
      ans = (B/2);
    else
      ans = 0;
    System.out.println(ans);
  }
}
    

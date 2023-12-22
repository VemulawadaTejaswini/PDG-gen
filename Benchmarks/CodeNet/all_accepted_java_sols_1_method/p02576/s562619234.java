import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    double X=sc.nextDouble();
    int T=sc.nextInt();
    double a =N/X;
    double temp=Math.ceil(N/X);
    double ans=T*temp;
    int ans1=(int)ans;
    
    
    
    System.out.println(ans1);
  }}
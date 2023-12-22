import java.util.Scanner;
class Main{
	public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n500=0,n5=0;
      n500=n/500;
      n=n%500;
     // System.out.println(n);
      n5=n/5;
      int happy=n500*1000+n5*5;
      System.out.println(happy);
      
    }
}
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int P=sc.nextInt();
      int Q=sc.nextInt();
      int R=sc.nextInt();
      int a=0;
      int b=0;
      if (R>Q){
        a=R;
        R=Q;
        Q=a;
      }
      if(Q>P){
        b=Q;
        Q=P;
        P=b;
      }
      System.out.println(Q+R);
    }
}
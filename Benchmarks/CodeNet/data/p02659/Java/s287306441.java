import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int A=sc.nextInt();
      double B=sc.nextDouble();
      int b=(int)(B*100);
      int x=A*b;
      int y=x%100;
      int a=(int)(x-y)/100;
      System.out.println(a);
	}
}
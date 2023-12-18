import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      long A=sc.nextLong();
      double B=sc.nextDouble();
      int b=(int)B*100;
      long x=A*b;
      double y=x/100;
      long a=(long)Math.floor(y);
      System.out.println(a);
	}
}
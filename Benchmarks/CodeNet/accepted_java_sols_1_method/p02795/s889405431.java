import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int w=s.nextInt();
		int n=s.nextInt();

		System.out.println(Math.min((n+h-1)/h,(n+w-1)/w));
	}
}

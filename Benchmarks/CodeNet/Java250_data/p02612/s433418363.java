import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n/1000;
		int b=n%1000;
		int c=0;
		if(b==0) {
			System.out.println(c);
		}
		else {
			System.out.println(1000-b);
		}
	}
	
}
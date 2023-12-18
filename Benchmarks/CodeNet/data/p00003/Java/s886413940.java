import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++){
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			if(a*a==b*b+c*c||a*a+b*b==c*c||a*a+c*c==b*b)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
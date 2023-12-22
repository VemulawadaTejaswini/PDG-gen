import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
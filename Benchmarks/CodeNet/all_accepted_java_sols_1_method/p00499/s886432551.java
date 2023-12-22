import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		if((a/c)>(b/d)){
			if(a%c==0)System.out.println(n-(a/c));
			else System.out.println(n-(a/c+1));
		}else{
			if(b%d==0)System.out.println(n-(b/d));
			else System.out.println(n-(b/d+1));
		}
	}
}
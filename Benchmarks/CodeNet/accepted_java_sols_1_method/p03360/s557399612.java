import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = Math.max(a, Math.max(b, c));
		int other = a+b+c-max;
		int K = sc.nextInt();
		for(int i=0;i<K;++i) max *= 2;
		System.out.println(max+other);
		return;
	}
}
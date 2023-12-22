import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		
		int alice = 0;
		int bob = 0;
		for(int i=0;i<N;i++){
			if(i%2==0) alice += a[N-1-i];
			else bob += a[N-1-i];
		}
		System.out.println((alice-bob));
		return;
	}
}
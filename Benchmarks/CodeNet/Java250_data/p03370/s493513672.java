import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		int cnt = n;
		for(int i = 0;i < n;i++){
			m[i] = sc.nextInt();
		}
		for(int i : m){
			x -= i;
		}
		Arrays.sort(m);
		
		System.out.println((int)(cnt+Math.floor(x/m[0])));
	}
}

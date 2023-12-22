import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ex = Integer.parseInt(sc.next());
		int[] teki = new int[n];
		for(int i = 0; i < n; i++){
			teki[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(teki);
		n -= ex;
		long res = 0L;
		for(int i = 0; i < n; i++){
			res += teki[i];
		}
		System.out.println(res);
	}
	
}
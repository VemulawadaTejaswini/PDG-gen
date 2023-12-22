import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		int count = 0;
		for(int i=0 ; i<n ; i++){
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		for(int i=0;i<n;i++){
			count+=(i%2==0)?num[n-1-i]:-num[n-1-i];
		}
		System.out.println(count);
	}
}

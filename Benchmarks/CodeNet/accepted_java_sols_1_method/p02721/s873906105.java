import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int c = scan.nextInt();
		String s = scan.next();
		
		int[] left = new int[n];
		int count = 0;
		for(int i = 0; i < n; i++){
			if(s.charAt(i) != 'x') {
				left[i] = count+1;
				i += c;
				count++;
				if(count == k) break;
			}
		}
		
		int[] right = new int[n];
		count = 0;
		for(int i = n-1; i >= 0; i--) {
			if(s.charAt(i) != 'x') {
				right[i] = k-count;
				i -= c;
				count++;
				if(count == k) break;
			}
		}
		
		for(int i = 0; i < n; i++) 
			if(left[i] == right[i] && left[i] != 0)
				System.out.println(i+1);
	}
}
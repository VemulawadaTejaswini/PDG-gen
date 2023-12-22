import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		String N = in.nextLine();
		int n = Integer.parseInt(N);
		String b = in.nextLine();
		char[] s = b.toCharArray();
		
		int[] west = new int[n];
		int[] east = new int[n];
		if(s[0] == 'W') {
			west[0] = 1;
			east[0] = 0;
		}else {
			west[0] = 0;
			east[0] = 1;
		}
		for(int i=1; i<n; i++) {
			if(s[i] == 'W') {
				west[i] = west[i-1] + 1;
				east[i] = east[i-1];
			}else {
				west[i] = west[i-1];
				east[i] = east[i-1] + 1;
			}
		}

		int min = n;
		if(east[n-1]-east[0]<min) {
			min = east[n-1]-east[0];
		}
		if(west[n-2]<min) {
			min =west[n-2];
		}
		for(int leader=1; leader<n-1; leader++) {
			int count = west[leader-1] + east[n-1]-east[leader];
			if(count < min) {
				min = count;
			}
		}
		System.out.print(min);
		in.close();
		
	}
}

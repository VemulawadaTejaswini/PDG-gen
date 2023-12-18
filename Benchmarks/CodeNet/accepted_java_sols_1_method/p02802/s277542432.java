import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		boolean[] answer = new boolean[n];
		for(int i=0;i<n;i++) {
			answer[i] = false;
		}
		
		int[] wacount = new int[n];
		for(int i=0;i<n;i++) {
			wacount[i] = 0;
		}
		
		int wacountsum = 0;
		for(int i=0;i<m;i++) {
			int p = sc.nextInt();
			String s = sc.next();
			sc.nextLine();
			if(s.equals("AC") && !(answer[p-1])) {
				answer[p-1] = true;
				wacountsum += wacount[p-1];
			} else if(s.equals("WA") && !(answer[p-1])) {
				wacount[p-1]++;
			} else {
				
			}
		}
		
		int correctnum = 0;
		for(int i=0;i<n;i++) {
			if(answer[i]) {
				correctnum++;
			}
		}
		
		System.out.println(correctnum + " " + wacountsum);
	}
}

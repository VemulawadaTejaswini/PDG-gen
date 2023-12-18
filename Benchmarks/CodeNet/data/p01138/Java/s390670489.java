import java.util.Scanner;
public class Main {
	public static int Max = 24 * 60 * 60;
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n = sc.nextInt();
				if(n == 0) break;
				
				int[] t = new int[Max];
				for(int i=0; i<n; i++) {
					String[] s = sc.next().split(":");
					int start = Integer.parseInt(s[0])*3600 + Integer.parseInt(s[1])*60+Integer.parseInt(s[2]);
					
					String[] e = sc.next().split(":");
					int end = Integer.parseInt(e[0])*3600 + Integer.parseInt(e[1])*60+Integer.parseInt(e[2]);
					
					t[start]++;
					if(end < Max) t[end]--;
				}
				
				int max = 0;
				for(int i=1; i<Max; i++) {
					t[i] += t[i-1];
					max = Math.max(max, t[i]);
				}
				System.out.println(max);
			}
		}
	}
}


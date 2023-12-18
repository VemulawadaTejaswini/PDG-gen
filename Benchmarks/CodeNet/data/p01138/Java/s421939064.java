import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int [] trains = new int[86400];
			for(int i=0;i<86400;i++) {
				trains[i] = 0;
			}
			String [] start = new String[3];
			String [] end = new String[3];
			int ss = 0;
			int ee = 0;
			for(int i=0;i<n;i++) {
				String st = sc.next();
				String en = sc.next();
				start = st.split(":");
				end = en.split(":");
				ss = Integer.parseInt(start[0])*3600 + Integer.parseInt(start[1])*60 + Integer.parseInt(start[2]);
				ee = Integer.parseInt(end[0])*3600 + Integer.parseInt(end[1])*60 + Integer.parseInt(end[2]);
				for(int j=ss;j<ee;j++) {
					trains[j]++;
				}
			}
			int ans = 0;
			for(int i=0;i<86400;i++) {
				ans = Math.max(ans, trains[i]);
			}
			System.out.println(ans);
		}
	}
}

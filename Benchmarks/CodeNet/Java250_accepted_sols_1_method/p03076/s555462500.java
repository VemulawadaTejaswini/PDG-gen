import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int[] time = new int[5];
		for(int i=0;i<time.length;i++) {
			time[i] = Integer.parseInt(sc.next());
		}
		
		int[] los = new int[5];
		int totaltime = 0;
		for(int i=0;i<los.length;i++) {
			if(time[i]<10) {
				los[i] = 10-time[i];
			}else if(time[i]<100) {
				int t = (time[i]/10);
				los[i] = 10-(time[i]-t*10);
				if(los[i]==10) los[i]=0;
			}else {
				int t = (time[i]/10);
				los[i] = 10-(time[i]-t*10);
				if(los[i]==10) los[i]=0;
			}
		}
		
		for(int i=0 ;i<los.length;i++) {
			totaltime += time[i]+los[i];
		}
		int max=los[0],index=0;
		for(int i=1;i<los.length;i++) {
			if(los[i]>max) {
				max=los[i];
				index=i;
			}
		}
		
		System.out.println(totaltime-los[index]);
		
	}
}

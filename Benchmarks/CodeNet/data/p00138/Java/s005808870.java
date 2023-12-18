import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class time implements Comparable<time>{
		int num;
		double numtime;
		public time(int num, double numtime) {
			this.num = num;
			this.numtime = numtime;
		}
		@Override
		public int compareTo(time o) {
			if(o.numtime-numtime < 0) return 1;
			else return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		time[][] a = new time[3][8];
		for(int i=0;i<3;i++){
			for(int j=0;j<8;j++)a[i][j]=new time(in.nextInt(),in.nextDouble());
			Arrays.sort(a[i]);
		}
		time[] t = new time[6];
		int x = 0;
		for(int i=0;i<3;i++){
			System.out.printf("%d %.2f\n", a[i][0].num, a[i][0].numtime);
			System.out.printf("%d %.2f\n", a[i][1].num, a[i][1].numtime);
			t[x++] = a[i][2];
			t[x++] = a[i][3];
		}
		Arrays.sort(t);
		System.out.printf("%d %.2f\n", t[0].num, t[0].numtime);
		System.out.printf("%d %.2f\n", t[1].num, t[1].numtime);
	}
}
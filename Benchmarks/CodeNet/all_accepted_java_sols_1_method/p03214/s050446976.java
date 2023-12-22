import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int ave = 0;
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
			ave += a[i];
		}
		for(int i=0;i<n;i++) {
			a[i] *= n;
		}
		int nearestIdx = n-1;
		int minAbSub = Math.abs(a[n-1]-ave);
		for(int i=n-2;i>=0;i--) {
			int nowAbSub = Math.abs(a[i]-ave);
			if(nowAbSub<=minAbSub) {
				minAbSub = nowAbSub;
				nearestIdx = i;
			}
		}
		System.out.println(nearestIdx);
		in.close();
	}

}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int color[] = new int[9];
		int min=0;
		for(int i=0; i<n; i++) {
			int r = sc.nextInt();
			int c=-1;
			if(r<=399) {
				c=0;
			} else if(r<=799) {
				c=1;
			} else if(r<=1199) {
				c=2;
			} else if(r<=1599) {
				c=3;
			} else if(r<=1999) {
				c=4;
			} else if(r<=2399) {
				c=5;
			} else if(r<=2799) {
				c=6;
			} else if(r<=3199) {
				c=7;
			} else {
				c=8;
			}
			if(c != 8 && color[c]==0) {
				min++;
			}
			color[c]++;
		}
		int max=min;
		if(min==0) {
			min=1;
			max=color[8];
		} else {
			max = min + color[8];
		}
		System.out.println(min + " " + max);
		sc.close();
	}
}



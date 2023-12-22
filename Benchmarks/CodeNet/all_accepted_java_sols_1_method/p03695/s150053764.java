import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] colorInfo = new int[8];
		int freeColor = 0;
		for(int i=0;i <n;i++) {
			int rate = sc.nextInt();
			if(rate >= 3200) {
				freeColor++;
				continue;
			}
			if(rate <=399) {
				colorInfo[0]++;
				continue;
			}
			if(rate <=799) {
				colorInfo[1]++;
				continue;
			}
			if(rate <=1199) {
				colorInfo[2]++;
				continue;
			}
			if(rate <=1599) {
				colorInfo[3]++;
				continue;
			}
			if(rate <=1999) {
				colorInfo[4]++;
				continue;
			}
			if(rate <=2399) {
				colorInfo[5]++;
				continue;
			}
			if(rate <=2799) {
				colorInfo[6]++;
				continue;
			}
			if(rate <=3199) {
				colorInfo[7]++;
				continue;
			}
		}

		int min =0;
		for(int i =0;i <=7;i++) {
			if(colorInfo[i] >0) {
				min++;
			}
		}
		if(min ==0) {
			min =1;
			freeColor--;
		}
		int max = min + freeColor;
		System.out.println(min + " " + max);
	}
}
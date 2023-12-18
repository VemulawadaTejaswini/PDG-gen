import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long mtjkn=0;
		int[] po;
		while(true) {
			mtjkn=0;
			int ninzu=sc.nextInt();
			if(ninzu==0) {
				break;
			}
			else {
				po=new int[ninzu];
				for(int i=0; i<ninzu; i++) {
					po[i]=sc.nextInt();
				}
				Arrays.sort(po);

				for(int i=0; i<ninzu-1; i++) {
					mtjkn+=po[i]*(ninzu-1-i);
				}
				System.out.println(mtjkn);
			}
		}
	}
}

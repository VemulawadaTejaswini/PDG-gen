import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nyuryoku=sc.nextInt();
		int[] sort=new int[nyuryoku];
		for(int i=0; i<nyuryoku; i++) {
			sort[i]=sc.nextInt();
		}
		int[] seikei=new int[nyuryoku];
		for(int i=0; i<nyuryoku; i++) {
			seikei[i]=sort[i];
		}
		int[] copuy=new int[nyuryoku];
		copuy=seikei;

		Arrays.sort(copuy);

		int a=copuy[nyuryoku/2-1];
		int b=copuy[nyuryoku/2];
		for(int i=0; i<nyuryoku; i++) {
			if(sort[i]>a) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
	}
}
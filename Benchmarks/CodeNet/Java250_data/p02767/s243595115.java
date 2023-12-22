
import java.util.Scanner;
//【156】
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n =sc.nextInt();
		int[] xs =new int[n+1];
		int max=0;
		int min =100;
		for (int i=0;i<n;i++) {
			int xs_i =sc.nextInt();
			xs[i] =xs_i;
			max =Math.max(max, xs_i);
			min =Math.min(min, xs_i);
		}
		int minHp=0;
		for (int i=0;i<n;i++) {
			minHp +=(xs[i])*(xs[i]);
		}
		for (int i=min;i<=max;i++) {
			int hp =0;
			for (int j=0;j<n;j++) {
				hp +=(xs[j]-i)*(xs[j]-i);
			}
			minHp =Math.min(minHp, hp);
		}
		System.out.println(minHp);
		
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	
	//----------------------------------------
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int acount = sc.nextInt();
		int bcount = sc.nextInt();
		int mcount = sc.nextInt();
		int []a = new int[acount];
		int []b = new int[bcount];
		int mina,minb;
		mina = 999999;
		minb = 999999;
		for (int i=0;i<acount;i++) {
			a[i]=sc.nextInt();
			if (a[i]<mina) {
				mina = a[i];
			}
		}
		for (int i=0;i<bcount;i++) {
			b[i]=sc.nextInt();
			if (b[i]<minb) {
				minb = b[i];
			}
		}

		int min =mina + minb;
		for (int i=0;i<mcount;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int cut = sc.nextInt();
			if (a[x-1]+b[y-1]-cut<min) {
				min =a[x-1]+b[y-1]-cut;
			}
		}
		System.out.println(min);
	}
}
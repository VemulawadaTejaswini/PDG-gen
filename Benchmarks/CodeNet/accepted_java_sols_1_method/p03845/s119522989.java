import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] t = new int[n];
		for(int i=0;i<n;i++) {
			t[i]=scan.nextInt();
		}
		int m = scan.nextInt();
		int[] p = new int[m];
		int[] x = new int[m];
		for(int i=0;i<m;i++) {
			p[i]=scan.nextInt();
			x[i]=scan.nextInt();
		}
		int zanteiSum = 0;
		for(int i : t) {
		zanteiSum = zanteiSum + i;
		}
		//System.out.println(zanteiSum);

		int[] byosu=new int[m];

		for(int i=0; i<m;i++) {
			for(int z=0;z<n;z++) {
				if(z==p[i]-1) {
					byosu[i]=byosu[i]+x[i];
				}else {
					byosu[i]=byosu[i]+t[z];
				}

			}
			System.out.println(byosu[i]);


		}
	}
}


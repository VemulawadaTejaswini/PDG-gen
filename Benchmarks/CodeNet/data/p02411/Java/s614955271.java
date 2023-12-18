import java.util.Scanner;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//中間テストm,期末テストf,再テストrの配列を作成
		int[]m = new int[50];
		int[]f = new int[50];
		int[]r = new int[100];
		while(true) {
			for(int i=0;i<=50;i++) {
				//各配列の中身をゲットする
				m[i]=sc.nextInt();
				f[i]=sc.nextInt();
				r[i]=sc.nextInt();
				//ここから条件分岐
				if(m[i]==-1 && f[i]==-1 && f[i]==-1) break;
				if(m[i]+f[i]>=80) System.out.println("A");
				if(m[i]+f[i]<80 && m[i]+f[i]>=65) System.out.println("B");
				if(m[i]+f[i]<65 && m[i]+f[i]>=50) System.out.println("C");
				if(m[i]+f[i]<50 && m[i]+f[i]>=30) {
					System.out.println("D");
					if(r[i]>=50 ) System.out.println("C");
				}
				if(m[i]+f[i]<30 || m[i]==-1 || f[i]==-1) System.out.println("F");
			}
		}
	}
}


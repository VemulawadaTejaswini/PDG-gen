import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c[] = new int[500],s[] = new int[500],f[] = new int[500];

		for(int i = 0; i < n-1; i++) {
			c[i] = sc.nextInt();//次の駅にc秒で向かう
			s[i] = sc.nextInt();//s秒が始発
			f[i] = sc.nextInt();//f秒置きに発車
		}
		for(int i = 0; i < n; i++) {//駅1から駅nまで全探索
			int t = 0;//最初の時間は0
			for(int j = i; j < n-1; j++) {//j駅目からn駅目まで移動する
				if(t<s[j]) t=s[j];
				else if(t%f[j]==0);
				else t=t+f[j]-t%f[j];
				t += c[j];
			}
			System.out.println(t);
		}
	}
}

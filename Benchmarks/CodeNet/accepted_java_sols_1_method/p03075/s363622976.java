import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] s = new int[5];

		// 整数の入力
		s[0] = sc.nextInt();
		s[1] = sc.nextInt();
		s[2] = sc.nextInt();
		s[3] = sc.nextInt();
		s[4] = sc.nextInt();
		int k = sc.nextInt();
		boolean flg = true;

		for(int n=0;n<4&&flg;n++){
			for(int m=n+1;m<5&&flg;m++){
				if(s[m]-s[n]>k)flg=false;
			}
		}

		// 出力
		System.out.println(flg?"Yay!":":(");
	}
}
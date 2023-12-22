import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int yen = 100000;
		int m;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++){
			//利子計算
			yen *= 1.05;
			//金額を文字列に変換
			String s = Integer.toString(yen);
			//後ろ三桁を抜き出してint型に変換
			m	=	Integer.parseInt(s.substring(s.length()-3));
			//ゼロでなかったら切り上げ
			if(m!=0){
				yen += 1000-m;
			}
		}
		System.out.println(yen);
	}
}
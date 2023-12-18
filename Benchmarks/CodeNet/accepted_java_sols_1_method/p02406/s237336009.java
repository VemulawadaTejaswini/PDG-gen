import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

//		入力nを読み取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		//aが0より大きい間
		while(a<=n){
			
			//計算用の変数b
			int b = a;
			//3で割れる時
			if(b%3==0){
				
				System.out.print(" "+a);
			
			//3で割れない時	
			}else{
				//0より大きい間
				while(b>0){
					//10で割った時3あまる時
					if(b%10==3){
						System.out.print(" "+a);
						break;
					}
					//位の移動
					b/=10;
				}
			}
			a++;
		}
		//改行
		System.out.println("");
	}
}

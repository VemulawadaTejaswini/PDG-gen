import java.util.*;
public class Main{
	public static void main(String[] args){
		//N枚のうちi枚目に文字列siにはM枚のうちi枚目に文字列ti
		//文字列一つ入力
		//青いカードにそれがあれば1円
		//赤いカードの時は1円失う
		//
		//手法
		//文字列の比較はequalsを使う
		//
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String si[] = new String[n];
		int money = 0;//高橋の財産
		int countp = 0;//+のカウント
		int countm = 0;//-のカウント
		int maxresultbox = 0;
		

		for (int i = 0;i < n;i++){//解釈
			si[i] = sc.next();
		}

		int m = sc.nextInt();		
		String ti[] = new String[m];
			
		for (int i = 0;i < m;i++){
			ti[i] = sc.next();
		}//文字列受け取り

		//青1文字目に対してsi同じ文字があるか文字チェック
		for (int i = 0;i < n;i++){//Nに対して
			countp = 0;
			countm = 0;
			for(int ii = 0;ii < n;ii++){//Nの配列の比較

				if(si[i].equals(si[ii])){//文字列の一致

					countp++;
					
				}
				
			}

			for(int ii = 0;ii < m;ii++){//Mの配列の比較

				if(si[i].equals(ti[ii])){

					countm++;
					
				}
				
			}
			maxresultbox = Math.max(maxresultbox,countp-countm);
			
		}

		for (int i = 0;i < m;i++){//Mに対して
			
			countp = 0;
			countm = 0;

			for(int ii = 0;ii < n;ii++){//Nの配列の比較

				if(ti[i].equals(si[ii])){

					countp++;
					
				}
				
			}

			for(int ii = 0;ii < m;ii++){//Mの配列の比較

				if(ti[i].equals(ti[ii])){

					countm++;
					
				}
				
			}
			maxresultbox = Math.max(maxresultbox,countp-countm);			
			
		}
		
		System.out.println(maxresultbox);

	}
	
}

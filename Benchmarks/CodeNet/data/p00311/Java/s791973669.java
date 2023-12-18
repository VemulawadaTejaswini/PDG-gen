import java.util.*;

class Main
{
	static Scanner scan = new Scanner(System.in);
	
	static int nextInt(){
		return scan.nextInt();
	}
	
	static int h1=nextInt(); // 浩が釣り上げたイワナの数
	static int h2=nextInt(); // 浩が釣り上げたヤマメの数
	
	static int k1=nextInt(); // 健次郎が釣り上げたイワナの数
	static int k2=nextInt(); // 健次郎が釣り上げたヤマメの数
	
	static int a=nextInt(); // イワナ１匹ごとの点数
	static int b=nextInt(); // ヤマメ１匹ごとの点数
	static int c=nextInt(); // イワナ１０匹ごとの追加点数
	static int d=nextInt(); // ヤマメ２０匹ごとの追加点数
	
	static int score(int iwana, int yamame){
		return a*iwana + c*(iwana/10) + b*yamame + d*(yamame/20);
	}
	
	public static void main(String args[]){
		int hiroshiScore = score(h1,h2);
		int kenjiroScore = score(k1,k2);
		if( hiroshiScore > kenjiroScore ){
			System.out.println("hiroshi");
		}else if( hiroshiScore < kenjiroScore ){
			System.out.println("kenjiro");
		}else{
			System.out.println("even");
		}
	}
}


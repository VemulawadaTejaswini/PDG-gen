import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		//持っているトランプの数
		int intTotal = scan.nextInt();
		int[] arrayS = new int[13];
		int[] arrayH = new int[13];
		int[] arrayC = new int[13];
		int[] arrayD = new int[13];

		//それぞれのマークの配列に１から１３を代入
		for(int i = 1 ;i <= 13;i++){
			arrayS[i-1] = i;
			arrayH[i-1] = i;
			arrayC[i-1] = i;
			arrayD[i-1] = i;
		}

		//要素数がintTotal個の配列を宣言
		//マークと数字を別でとるため * 2
		String[] array = new String[intTotal * 2];

		//intTotal回Scannerで入力されたマークと数字を読み取っていく
		for(int i = 0 ;i < intTotal * 2;i+=2){
			//マークの読み取り
			array[i] = scan.next();
			//数字の読み取り
			array[i + 1] = scan.next();
		}


		//要素数2nでマークを判定、
		for(int i = 0 ;i < intTotal * 2;i+=2){
			//array[2n]が"S"のとき
			if(array[i].equals("S")){

				//マークの配列の数とarray[n+1]の配列を比較
				//同じなら比較したマークの配列の数を０にする
				for(int j = 0 ;j < 13;j++){
					if(arrayS[j] == Integer.parseInt(array[i+1])){
						arrayS[j] = 0;
					}
				}
			}
			//array[2n]が"H"のとき
			if(array[i].equals("H")){
				for(int j = 0 ;j < 13;j++){
					if(arrayH[j] == Integer.parseInt(array[i+1])){
						arrayH[j] = 0;
					}
				}
			}
			//array[2n]が"C"のとき
			if(array[i].equals("C")){
				for(int j = 0 ;j < 13;j++){
					if(arrayC[j] == Integer.parseInt(array[i+1])){
						arrayC[j] = 0;
					}
				}
			}
			//array[2n]が"D"のとき
			if(array[i].equals("D")){
				for(int j = 0 ;j < 13;j++){
					if(arrayD[j] == Integer.parseInt(array[i+1])){
						arrayD[j] = 0;
					}
				}
			}
		}
		//配列が0のものは持っているものなので出力しない
		for(int i = 0; i < 13;i++){
			if(arrayS[i] > 0 ){
				System.out.println("S " + arrayS[i]);
			}
		}
		for(int i = 0; i < 13;i++){
			if(arrayH[i] > 0 ){
				System.out.println("H " + arrayH[i]);
			}
		}
		for(int i = 0; i < 13;i++){
			if(arrayC[i] > 0 ){
				System.out.println("C " + arrayC[i]);
			}
		}
		for(int i = 0; i < 13;i++){
			if(arrayD[i] > 0 ){
				System.out.println("D " + arrayD[i]);
			}
		}
		scan.close();
	}
}


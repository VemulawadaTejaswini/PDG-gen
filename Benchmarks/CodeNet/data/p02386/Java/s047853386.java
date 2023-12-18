import java.util.Arrays;
import java.util.Scanner;

class Main {

	static String anther="Yes";
	//比較をするためサイコロを2つ用意する
	static Dice dice=new Dice();
	static Dice dice2=new Dice();


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);



	


		int n=scanner.nextInt();
		int alldice[][]=new int[n][6];//全てのサイコロの目を記録する

		for(int i=0;i<n;i++){
			for(int k=0;k<6;k++){
				alldice[i][k]=scanner.nextInt();
			}
		}


		//サイコロの全比較、
		for(int i=0;i<n;i++){
			for(int k=i+1;k<n;k++){
				for(int p=0;p<6;p++){
					dice.num[p]=alldice[i][p];
					dice2.num[p]=alldice[k][p];
				}
				co();
				}
		}
	

		System.out.println(anther);
		scanner.close();
						}

	
	//サイコロ比較メソッド
	public static void co(){



		for(int i =0; i<4;i++){
			dice.Roll("S");  //水平軸に一回転
			for(int k =0;k<4;k++){
				dice.Roll("W");  //垂直軸に一回転
				for(int p=0;p<4;p++){
					dice.Roll("R"); //縦軸に一回転
					if(Arrays.equals(dice.num,dice2.num)){
						anther="No";
					}
				}
			}
		}
	}
}





class Dice {

	int num [];
	Dice(){
		num= new int[6];
	}

	int box=0;



	public void Roll(String order) {


		switch(order){//配列の各数字をサイコロの展開図に見立て動きを再現

		case "S" :

			box=num[0];
			num[0]=num[4];
			num[4]=num[5];
			num[5]=num[1];
			num[1]=box;


			break;

		case "N" :

			box=num[0];
			num[0]=num[1];
			num[1]=num[5];
			num[5]=num[4];
			num[4]=box;


			break;

		case "W" :

			box=num[0];
			num[0]=num[2];
			num[2]=num[5];
			num[5]=num[3];
			num[3]=box;


			break;

		case "E":


			box=num[0];
			num[0]=num[3];
			num[3]=num[5];
			num[5]=num[2];
			num[2]=box;


			break;

		case "R"://サイコロを縦軸で回転させる
			box=num[1];
			num[1]=num[2];
			num[2]=num[4];
			num[4]=num[3];
			num[3]=box;



		}


	}




}






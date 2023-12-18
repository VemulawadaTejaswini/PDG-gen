import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static long mod = 1000000007;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int aa = 0;
		int bb = 0;

		switch (a) {
		case 1:
			aa =1;
			break;
		case 3:
			aa =1;
			break;
		case 5:
			aa =1;
			break;
		case 7:
			aa =1;
			break;
		case 8:
			aa =1;
			break;
		case 10:
			aa =1;
			break;
		case 12:
			aa =1;
			break;
		case 2:
			aa =3;
			break;


		default:
			aa = 2;
			break;
		}
		switch (b) {
		case 1:
			bb =1;
			break;
		case 3:
			bb =1;
			break;
		case 5:
			bb =1;
			break;
		case 7:
			bb =1;
			break;
		case 8:
			bb =1;
			break;
		case 10:
			bb =1;
			break;
		case 12:
			bb =1;
			break;
		case 2:
			bb =3;
			break;


		default:
			bb = 2;
			break;
		}

		if(aa == bb){
			System.out.println("Yes");
		}else{
			System.out.println("No");

		}





	}


}



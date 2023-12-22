import java.util.Scanner;

class Main{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		int x =sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
	if(Math.abs(a-x) > Math.abs(b-x)){
		System.out.println("B");
	}else{
		System.out.println("A");

	}

	}

}
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b%a == 0){
			System.out.println(a + b);
		}else{
			System.out.println(b - a);
		}
	}
}


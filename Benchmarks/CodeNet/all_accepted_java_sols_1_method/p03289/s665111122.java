import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		if(string.charAt(0) != 'A'){
			System.out.println("WA");
			return;

		}
		int c = 0;
		for(int i= 2;i < string.length()-1;i++){
			if(string.charAt(i) == 'C'){
				c++;
			}
		}
		for(int i = 1;i < string.length()-1;i++){
			if(Character.isUpperCase( string.charAt(i)) && string.charAt(i) != 'C'){
				System.out.println("WA");
				return;

			}
		}


		if(c != 1){
			System.out.println("WA");
			return;

		}

		if(Character.isUpperCase( string.charAt(string.length()-1) )){

			System.out.println("WA");
			return;

		}
		System.out.println("AC");


	}
}




import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(C >= B/A){
			System.out.println(B/A);
		}else{
			System.out.println(C);
		}

		
	}
	
	
}


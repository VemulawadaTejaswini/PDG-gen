import java.util.Scanner;

public class AOJ0565 {

	public static void main(String[] args) {
		int[] pasta = {0,0,0};
		int[] juice = {0,0};
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			pasta[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++){
			juice[i] = sc.nextInt();
		}
		int min = pasta[0] + juice[0];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				if(min > pasta[i] + juice[j]) min = pasta[i] + juice[j];
			}
		}
		System.out.println(min - 50);
	}

}
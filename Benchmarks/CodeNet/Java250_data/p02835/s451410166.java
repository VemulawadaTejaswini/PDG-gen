import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i< 3; i++){
			sum += sc.nextInt();
		}

		if(sum < 22){
			System.out.print("win");

		}else {
			System.out.print("bust");
		}
	}
}

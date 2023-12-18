import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int mod = n % 10;

		if (mod == 2 || mod == 4 || mod == 5 ||mod == 7 || mod==9 ){
			System.out.println("hon");
		} else if (mod == 3){
			System.out.println("bon");
		} else {
			System.out.println("pon");
		}


	}


}
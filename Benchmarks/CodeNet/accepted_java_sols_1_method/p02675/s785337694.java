import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int firstInt = sc.nextInt();
		sc.close();

		firstInt = firstInt % 10;

		if(firstInt == 3) {
			System.out.println("bon");
		}else if(firstInt == 0 || firstInt == 1 || firstInt == 6 || firstInt == 8) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}

	}

}
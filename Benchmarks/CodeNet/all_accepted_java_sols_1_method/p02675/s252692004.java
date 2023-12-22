import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ones = N % 10;
		
		if(ones == 1){
			System.out.println("pon");
		} else if (ones == 2){
			System.out.println("hon");
		} else if (ones == 3){
			System.out.println("bon");
		} else if (ones == 4){
			System.out.println("hon");
		} else if (ones == 5){
			System.out.println("hon");
		} else if (ones == 6){
			System.out.println("pon");
		} else if (ones == 7){
			System.out.println("hon");
		} else if (ones == 8){
			System.out.println("pon");
		} else if (ones == 9){
			System.out.println("hon");
		} else if (ones == 0){
			System.out.println("pon");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] date = sc.nextLine().split("/");
		if(Integer.parseInt(date[1])<=4) {
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}
	}
}


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int x = sc.nextInt();
			if(30<=x) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}




		}catch(Exception e) {
			e.printStackTrace();
		}

	}


}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int x =  sc.nextInt();
			if(x == 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			




		}catch(Exception e) {
			e.printStackTrace();
		}

	}


}
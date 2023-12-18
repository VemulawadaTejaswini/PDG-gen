import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			String a = sc.next();
			
			if(a.toUpperCase().equals(a)) {
				System.out.println("A");
			}else {
				System.out.println("a");
			}



		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}

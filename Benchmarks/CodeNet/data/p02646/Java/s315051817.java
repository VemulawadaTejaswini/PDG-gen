import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long aPos = sc.nextLong();
			long aSpeed = sc.nextLong();

			long bPos = sc.nextLong();
			long bSpeed = sc.nextLong();

			long time = sc.nextLong();

			if(bSpeed - aSpeed >=0) {
				System.out.println("NO");
				return;
			}

			if(Math.abs(bPos-aPos)/ (double)(aSpeed-bSpeed) <= time) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}



		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}


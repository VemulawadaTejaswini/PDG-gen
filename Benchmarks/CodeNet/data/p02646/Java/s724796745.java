import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int aPos = sc.nextInt();
			int aSpeed = sc.nextInt();

			int bPos = sc.nextInt();
			int bSpeed = sc.nextInt();

			int time = sc.nextInt();

			if(bSpeed - aSpeed >=0) {
				System.out.println("NO");
				return;
			}

			if(Math.abs(bPos-aPos)/ (aSpeed-bSpeed) <= time) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}



		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}


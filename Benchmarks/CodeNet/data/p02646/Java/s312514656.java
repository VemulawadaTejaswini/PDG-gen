import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long V = sc.nextLong();

		long B = sc.nextLong();
		long W = sc.nextLong();

		long T = sc.nextLong();

		long dis = Math.abs(A-B);
		long speed = V - W;

		if(speed <= 0) {
			System.out.println("NO");
		}else if(dis % speed == 0 && dis / speed <= T){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}

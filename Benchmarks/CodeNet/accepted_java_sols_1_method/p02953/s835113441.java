import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		int beforeHeight =sc.nextInt();
		boolean canAble = true;

		for(int i = 0;i < length - 1 ;i++) {
			int height = sc.nextInt();

			if(height > beforeHeight) {
				height--;
			}

			if(height < beforeHeight) {
				canAble = false;
				break;
			}

			beforeHeight = height;
		}

		System.out.println(canAble ? "Yes" : "No");

	}
}

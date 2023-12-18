import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int X = sc.nextInt();
		int Y = sc.nextInt();
		int h=Y;
		int count=0;

		while(h==0) {
			if(Y%4==0) {
				count++;
				h-=4;
			}
			else if(Y%2==0) {
				count++;
				h-=2;
			}else {
				System.out.println("No");
				break;
			}
			
			if(count == X && h==0) {
				System.out.println("Yes");
				break;
			}
		}

	}

}

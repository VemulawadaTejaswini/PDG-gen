import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int time = A + B;

		if(time<24){
			System.out.println(time);
		}else{
			time = time -24;
			System.out.println(time);
		}

	}

}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int x = scan.nextInt();
			if(x == 0){
				break;
			}
			int sum = 0;
			for(int i = (int)(Math.log10(x) + 1); i >= 0; i--){
				sum += (x / Math.pow(10, i));
				x %= Math.pow(10, i);
			}
			System.out.println(sum);
		}

	}

}
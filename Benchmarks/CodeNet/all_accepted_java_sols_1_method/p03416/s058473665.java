import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = a; i <= b; i++){
			int digit = String.valueOf(i).length();
			boolean bool = true;
			for(int j = 0; j <= digit/2; j++){
				int low = (int) ((i / Math.pow(10, j)) % 10);
				int up = (int) ((i / Math.pow(10, digit - j - 1)) % 10);
				if(!(bool = low == up)) break;
			}
			if(bool) {
				count++;
			}
		}
		System.out.println(count);
	}
}
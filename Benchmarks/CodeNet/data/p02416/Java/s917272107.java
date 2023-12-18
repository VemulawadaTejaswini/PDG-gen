import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int sum=0; //合計値
		while(i != 0){
			while(i > 0){
				sum += i%10;
				i = i / 10;
			}
			System.out.println(sum);
			i = sc.nextInt();
			sum=0;
		}
	}
}

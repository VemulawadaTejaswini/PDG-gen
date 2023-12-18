import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 100000;

		for(int i = 0; i < n; i++){
			sum *= 1.05;
			if(sum % 1000 != 0){
				sum += 1000 - sum % 1000;
			}
		}
		System.out.println(sum);
	}
}
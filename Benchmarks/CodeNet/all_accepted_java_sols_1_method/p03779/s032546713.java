import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int i = 0;
		int sum = 0;
		
		while(sum < X){
			i++;
			sum += i;
		}
		
		System.out.println(i);

	}

}
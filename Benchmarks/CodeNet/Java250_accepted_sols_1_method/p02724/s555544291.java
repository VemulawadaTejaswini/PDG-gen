import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int max = 0;

		if(x / 500 > 0){
			max = ((x / 500) * 1000) + max;
			if((x % 500) / 5 > 0){
				max = (((x % 500) / 5) * 5) + max;
			}
		}
		else if(x / 5 > 0){
			max = (x / 5) * 5 + max;
		}

		System.out.println(max);
		sc.close();
	}
}
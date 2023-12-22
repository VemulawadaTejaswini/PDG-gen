import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int count  = 0;
		while(true) {
			if(b == 1)
				break;
			count++;
			sum += a;
			//System.out.println(sum);
			if(sum >= b)
				break;

			if(sum != 0)
				sum--;
			//System.out.println(sum);
		}
        System.out.println(count);

	}


}

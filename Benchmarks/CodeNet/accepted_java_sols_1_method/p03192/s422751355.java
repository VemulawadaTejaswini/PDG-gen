import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		n = sc.nextInt();
		
		sc.close();
		
		int tmp = n, tmp2 = n, i = 10000;
		int count = 0;
		while(tmp > 0) {
			i /= 10;
			tmp /= i;
			tmp2 -= tmp * i;
			if(tmp == 2)
				++count;
			tmp = tmp2;
		}
		
		System.out.println(count);
	}

}

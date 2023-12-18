
import java.util.Scanner;

public class Main{


	static int a(int n){
		int min=n;
		for(int z=0; z<101; z++){
			for(int y=0; y<1001; y++){
				int x = n - (z*z*z) - (y*y);
				if(x < 0) continue;
				int sum = x+y+z;
				if(min >= sum) min = sum;
			}
		}
		return min;
	}




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			System.out.println(a(n));
			System.out.println(116 + 172 * 172 + 99 * 99 * 99);

		}

	}

}
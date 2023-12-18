
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int n = sc.nextInt();
		if(n==0) {break;}
		int max_yen = sc.nextInt();
		int temp_max=0;
		


		ArrayList<Integer> price = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			int in = sc.nextInt();
			for(int p:price) {
				int x= in+p;
				if(x > temp_max && x <= max_yen) {
					temp_max = x;
				}
			}
			price.add(in);
		}
		if(temp_max == 0) {
			System.out.println("NONE");
		}else {
		System.out.println(temp_max);
		}

		}
		sc.close();
	}

}

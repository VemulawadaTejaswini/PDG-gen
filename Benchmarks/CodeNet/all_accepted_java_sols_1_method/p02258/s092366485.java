import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long temp,min=0,res=-999999999;

		min = sc.nextLong();
		for(int i=1;i<n;i++) {
			temp=sc.nextLong();

			if(res < temp-min) {
				res = temp -min;
			}
			if(temp < min) {
				min = temp;
			}
		}
		System.out.println(res);

	}
}


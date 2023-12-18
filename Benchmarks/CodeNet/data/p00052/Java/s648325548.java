import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			long result=1;
			int count=0;
			for(int i=n; i>1; i--) {
				result *= i;
				while(result != 0 && result%10 == 0) {
					count++;
					result /= 10;
				}
				if(result > 1000000000) result %= 1000000000;
			}
			System.out.println(count);
		}
	}
}
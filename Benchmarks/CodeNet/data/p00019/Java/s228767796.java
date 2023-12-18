import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			long sum = 1;
			for(int i=2;i<=n;i++){
				sum *= i;
			}
			System.out.println(sum);
		}
	}
}
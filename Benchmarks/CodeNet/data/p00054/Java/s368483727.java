import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
						
			int sum = 0;
			for(int i=1;i<=n;i++){
				sum += (a*Math.pow(10, i)/b)%10;
			}
			System.out.println(sum);
			
		}
	}
}
import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		while(scan.hasNext()){
			int n = scan.nextInt();
			int cnt = 0;
			boolean isPrime = true;
			if(n <= 1){
				System.out.printf("%d\n", cnt);
			} else if(n == 2){
				cnt++;
				System.out.printf("%d\n", cnt);
			} else if(n == 3){
				cnt += 2;
				System.out.printf("%d\n", cnt);
			} else{
				cnt++;
				for(int i = 3; i <= n; i += 2){
					for(int j = 3; j <= Math.sqrt(i); j += 2){
						if(i % j == 0){
							isPrime = false;
							break;
						}
					}
					if(isPrime){
						cnt++;
					} else{
						isPrime = true;
					}
				}
				System.out.printf("%d\n", cnt);

			}
		}
	}
}
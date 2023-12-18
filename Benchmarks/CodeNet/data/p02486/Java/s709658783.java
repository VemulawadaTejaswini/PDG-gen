import java.util.*;

public class Main {
	
	private static final int M = (3 * (3-1) * (3-2));
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true){
			
			int n,x,sum,C;
		
			n = sc.nextInt();
			x = sc.nextInt();
			
			if(n == 0 && x == 0){
				break;
			}

			sum = 0;
			for (int i = 1; i <= n; i++){
				for (int j = 1; j <= n; j++){
					for (int k = 1; k <= n; k++){
						if ((i + j + k) == x && ((i != j) && (j != k) && (k != i))){
							sum += 1;
						}
					}
				}
			}
			C = sum / M;
			System.out.println(C);
		}
	}
}
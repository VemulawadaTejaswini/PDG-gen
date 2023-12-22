import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			
			int ways = 0;
			
			for(int i = 1; i <= a; i++){
				for(int j = 1; j <= a; j++){
					for(int k = 1; k <= a; k++){
						if(i != j && j != k && i != k){
							if((i + j + k) == b){
								ways++;
							}
						}
					}
				}
			}

			System.out.println(ways/6);
		}
		
		sc.close();
	}

}
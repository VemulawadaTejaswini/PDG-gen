import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int total = 0;
		for(int a = 1 ; a <= N ; a += 2){
			int count = 0;
				for(int b = 1 ; b <= a ; b += 2){
					if(a % b == 0){
						count++;
					}
				}
			if(count == 8){
				total++;
			}				
		}		
		System.out.println(total);
	}
}
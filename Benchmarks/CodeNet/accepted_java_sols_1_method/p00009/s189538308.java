import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			int n = scan.nextInt();
			Integer s[] = new Integer[n+1];

			for(int i = 2; i <= n; i++){
				if(s[i] == null && i%i == 0){
					s[i] = 1;
					
					for(int j = 2; i*j <= n; j++){
						s[i*j] = 0;
					}
				}
			}
			
			//count
			int count = 0;
			for(int i = 2; i <= n; i ++){
				if(s[i] == 1) count++;
			}
			System.out.println(count);
		}
	}
}
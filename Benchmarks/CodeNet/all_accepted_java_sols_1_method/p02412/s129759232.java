import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		while(true){
			int n = s.nextInt();
			int x = s.nextInt();
			
			if(n == 0 && x == 0) break;
			
			int counter = 0;
			
			for(int i = 1; i <= n-2; i++){
				for(int j = i + 1; j <= n-1; j++){
					for(int k = j + 1; k <= n; k++){
						if((i + j + k ) == x && i != j && j != k && k != i){
							counter ++;	
						}
					}
				}
			}
			System.out.println(counter);
		}
		s.close();
	}

}


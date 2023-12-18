import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int i = sc.nextInt();
			
			if(i == 0){
				break;
			}
			
			int s = 0;
			int sqr = (int)Math.floor(Math.sqrt((double)i));
			
			for(int j = 1; j <= sqr; j++){
				if((i != j) && (i % j == 0)){
					s = s + j;
					if ((j != 1) && (i != j * j)){
						s = s + (i / j);
					}
				}
			}
			
			if(i == s){
				System.out.println("perfect number");
			}else{
				if(i < s){
					System.out.println("abundant number");
				}else{
					System.out.println("deficient number");
				}
			}
		}
	}
}
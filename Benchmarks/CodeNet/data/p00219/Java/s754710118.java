import java.util.Arrays;
import java.util.Scanner;


public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			int[] count = new int[10];
			
			for(int i = 0; i < n; i++){
				count[sc.nextInt()]++;
			}
			
			for(int i : count){
				if(i == 0){
					System.out.println("-");
				}else{
					for(int j = 0; j < i; j++){
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}
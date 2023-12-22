import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);	
		
		int k = scan.nextInt();
		int t = scan.nextInt();
		
		int max = 0;
		
		for(int i = 0 ; i < t ; i++){
			
			int a = scan.nextInt();
			if(max < a){
				max = a;
			}
		}
		
		max = max / 2;
		max = max * 2;
		
		if(max > (k / 2)){
			if(t != 1){
				System.out.println(max - (k - max + 1));
			} else {
				System.out.println(max - 1);
			}
		} else {
			System.out.println("0");
		}
		
		
		
	}
}


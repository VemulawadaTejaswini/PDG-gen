import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			for(int i = 0; i < n; i++){
				int pm = sc.nextInt(), pe = sc.nextInt(), pj = sc.nextInt();
				
				if(Math.max(Math.max(pm, pe), pj) == 100){
					System.out.println("A");
				}else if((pm + pe)/2 >= 90){
					System.out.println("A");
				}else if((pm + pe + pj)/3 >= 80){
					System.out.println("A");
				}else if((pm + pe + pj)/3 >= 70){
					System.out.println("B");
				}else if((pm + pe + pj)/3 >= 50 && Math.max(pm, pe) >= 80){
					System.out.println("B");
				}else{
					System.out.println("C");
				}
			}
			
			
		}

	}

}
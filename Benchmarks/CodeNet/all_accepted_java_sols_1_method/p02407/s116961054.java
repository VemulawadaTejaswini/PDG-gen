import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> suuti = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		int a;
		
		for(int i = 0; i < n; i++){
			suuti.add(sc.nextInt());
			
		}
        
		Collections.reverse(suuti);
		
		for(a = 0; a < n; a++){
			System.out.print(suuti.get(a));
			if(a < n - 1){
				System.out.print(" ");
			}
		}
        
		System.out.println("");
		
        }

	}
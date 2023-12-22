import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		
		int n = scan.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++){
			num.add(scan.nextInt());
		}
		
		Collections.reverse(num);
		
		for(int i = 0; i < num.size(); i++){
			int b = num.get(i);
			System.out.print(b);
			if(i != n - 1){
				System.out.print(" ");
			}
			
		}
		System.out.println();
		}
	}
	
	
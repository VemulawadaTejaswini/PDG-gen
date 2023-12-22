import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		long sum = 0;
		int n = sc.nextInt();
		int a;
		
		if(0 < n && n <= 10000){
			
			for(int i = 0; i < n; i++){
				
				a = sc.nextInt();
				
				if(-1000000 <= a && a <= 1000000){
					array.add(a);
					sum = sum + a;
				}
				
			}
			
			Collections.sort(array);
			
			int na = array.size() - 1;
			int max = array.get(na);
			int min = array.get(0);
			
			System.out.println(min + " " + max + " " + sum);
		}
		
	}

}
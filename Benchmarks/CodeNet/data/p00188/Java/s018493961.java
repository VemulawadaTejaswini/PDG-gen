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
			
			int[] array = new int[n];
			
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			
			final int purpose = sc.nextInt();
			
			int start = 0;
			int end = n - 1;
			
			int count = 0;
			while(start <= end){
				int med = (end + start) / 2;
				
				count++;
				if(array[med] > purpose){
					end = med - 1;
				}else if(array[med] < purpose){
					start = med + 1;
				}else{
					break;
				}
			}
			
			System.out.println(count);
		}

	}

}
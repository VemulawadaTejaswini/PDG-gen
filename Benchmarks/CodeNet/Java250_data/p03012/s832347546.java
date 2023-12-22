import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Integer[] array = new Integer[n];
		
		for(int i = 0; i < n; ++i) {
		    int tmp = sc.nextInt();
		    array[i] = tmp;
		}
		
		int total = 0;
		int sum_1 = 0;
		int sum_2 = 0;
		
		int mini = 100;
		
		for(int i = 0; i < n; ++i) {
		    total += array[i];
		}
		
		for(int i = 0; i < n; ++i) {
		        sum_1 += array[i];
		        sum_2 = total - sum_1;
		        
		        if(mini > Math.abs(sum_1 - sum_2)) {
		            mini = Math.abs(sum_1 - sum_2);
		        }
		}
		
		System.out.println(mini);
	
	}
}
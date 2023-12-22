import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		int n = 2 * k - 1;
		int m = x;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = x - (k - 1);
			x++;
		}
		for(int i : arr){
			System.out.print(i + " ");
		}
		
	}
	
	
	}
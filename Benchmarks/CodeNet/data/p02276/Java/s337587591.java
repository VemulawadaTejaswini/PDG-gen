import java.util.Scanner;

public class Main{
	
	public static void part(int [] arr, int p, int r) {
		int x = arr[r];
		int i = p - 1;
		
		for(int j = p; j < r; j++) {
			if(arr[j] <= x) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			
			
		
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;
		
	
		
		for(int k = 0; k < arr.length; k++) {
			if(arr[k] == x && k == arr.length - 1) {
				System.out.print("[" + x + "]\n");
			}
			
			else if(k == i + 1) {
				System.out.print("[" + x + "] ");
			}
			
			else if(k == arr.length - 1) {
				System.out.print(arr[k] + "\n");
			}
			
			else {
				System.out.print(arr[k] + " ");
			}
		}
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		part(arr, 0, arr.length - 1);
	}

}


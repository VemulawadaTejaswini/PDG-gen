import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int n2 = in.nextInt();
		int [] arr2 = new int [n2];
		
		for(int i = 0; i < n2; i++) {
			arr2[i] = in.nextInt();
		}
		
		int count = 0;
		
		for(int i = 0; i < n2; i++) {
			
			for(int j = 0; j < n; j++) {
				if(arr2[i] == arr[j]) {
					count++;
					break;
					
				}
			}
		}
		
		System.out.println(count);
		
	}

}


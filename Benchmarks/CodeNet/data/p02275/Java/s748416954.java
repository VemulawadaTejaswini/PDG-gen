import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


public class Main {
	public static void main(String[] args) throws IOException {
    	/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String tmp_arr[] = new String[n];
		int arr[] = new int[n];
		
		tmp_arr = br.readLine().split(" ");
		for(int i=0; i<n;i++){
			arr[i] = Integer.parseInt(tmp_arr[i]);
		}*/
		
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        s.nextLine(); // throw away the newline.

        int [] arr = new int[count];
		int k = 10001;
		int [] C = new int[k];
		
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                arr[i] = numScanner.nextInt();
                C[arr[i]]++;
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }
		counting_sort(arr, C);
	}
	
	public static void counting_sort(int[] arr, int[] C){
		int n = arr.length;
		
		int new_arr[] = new int[n]; // sorted array 
		
		// record appearance
		for(int i=0; i<n; i++){
			C[arr[i]]++;
		}
		
		// C[i] makes the sum of appearance of the number less than i
		for(int i=1; i<=C.length; i++){
			C[i] = C[i] + C[i-1];
		}
			
		for(int i=n-1; i>=0; i--){
			new_arr[C[arr[i]]-1]= arr[i];
			C[arr[i]]--;
		}
		print_array(new_arr);
	}
	
	public static void print_array(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i != arr.length-1) System.out.print(" ");
			else System.out.print("\n");
		}
	}
}


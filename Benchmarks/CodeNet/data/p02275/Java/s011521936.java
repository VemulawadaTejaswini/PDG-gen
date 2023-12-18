import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


public class Main {
	public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        s.nextLine(); // throw away the newline.

        int [] arr = new int[count];
		int k = 10001;
		int [] C = new int[k];
		
        Scanner numScanner = new Scanner(s.nextLine());

        long before_io_time = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                arr[i] = numScanner.nextInt();
                C[arr[i]]++;
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }
//      long after_io_time = System.currentTimeMillis();
		counting_sort(arr, C);
//		long after_exec_time = System.currentTimeMillis();
//		System.out.println("io time: "+ Long.toString(after_io_time - before_io_time));
//		System.out.println("exec time: "+ Long.toString(after_exec_time - after_io_time));

	}
	
	public static void counting_sort(int[] arr, int[] C){
		int n = arr.length;
		int new_arr[] = new int[n]; // sorted array 
				
		// C[i] makes the sum of appearance of the number less than i
		for(int i=1; i<C.length; i++){
			C[i] = C[i] + C[i-1];
		}
			
		for(int i=n-1; i>=0; i--){
			new_arr[C[arr[i]]-1]= arr[i];
			C[arr[i]]--;
		}
		fast_print_array(new_arr);
	}
	
	public static void print_array(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i != arr.length-1) System.out.print(" ");
			else System.out.print("\n");
		}
	}
	public static void fast_print_array(int[] arr){
		StringBuilder builder = new StringBuilder();
		builder.append(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			builder.append(' ').append(arr[i]);
		}
		System.out.println(builder);
	}
}


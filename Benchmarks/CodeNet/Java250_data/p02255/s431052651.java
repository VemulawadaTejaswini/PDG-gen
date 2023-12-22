import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String x = "";
		try {
			int num = Integer.parseInt(in.readLine());
			
			x = in.readLine();
			String[] nums = x.split(" ");
			
			int[] a = new int[num];
			for (int i = 0; i < num; i++) {
				a[i] = Integer.parseInt(nums[i]);
			}

			System.out.print(a[0]);
			for (int j = 1; j < num; j++) {
				System.out.print(" " + a[j]);
			}
			System.out.println();
			
			for (int i = 1; i < num; i++) {
				int key = a[i];
				
				int j = i - 1;
				while ((j >= 0) && (a[j] > key)) {
					a[j + 1] = a[j];
					j--;
					a[j + 1] = key;
				}
				
				System.out.print(a[0]);
				for (j = 1; j < num; j++) {
					System.out.print(" " + a[j]);
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
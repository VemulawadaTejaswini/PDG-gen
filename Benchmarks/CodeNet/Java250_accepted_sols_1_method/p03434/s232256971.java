import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 Integer a[] = new Integer[N];
		 
		 for (int i = 0; i < N; i++) {
			 a[i] = scan.nextInt();
		 }
		 
		 Arrays.sort(a, Collections.reverseOrder());
		 
		 int sum_Allice = 0;
		 int sum_Bob = 0;
		 
		 for (int i = 0; i < N; i++) {
			 if (i % 2 == 0) {
				 sum_Allice += a[i];
			 } else {
				 sum_Bob += a[i];
			 }
		 }
		 
		 System.out.println(sum_Allice - sum_Bob);
		 scan.close();
		 

	}

}

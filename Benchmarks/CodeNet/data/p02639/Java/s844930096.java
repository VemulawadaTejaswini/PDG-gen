import java.util.*;

public class Main {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int result = 0;
	        int[] array = new int[5];
	        for(int i = 0; i<5; i++) {
	        	array[i] = sc.nextInt();
	            if(array[i]==0) result = i+1;

	        }





	        System.out.println(result);
	}
}

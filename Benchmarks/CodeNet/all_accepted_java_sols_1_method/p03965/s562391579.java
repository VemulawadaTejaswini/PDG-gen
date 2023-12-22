import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int point = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (i % 2 == 0) {
		        if (arr[i] == 'p') {
		            point--;
		        }
		    } else {
		        if (arr[i] == 'g') {
		            point++;
		        }
		    }
		}
		System.out.println(point);
   }
}




import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int array[]= new int[5];
		int pos = 0;
		int low = 9;
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
			int target = array[i] % 10;
			if (target!= 0 && low > target) {
				low = target;
				pos = i;
			}
		}
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (i != pos) {
				sum += array[i];
			}
			if ((sum % 10) != 0) {
				sum = (10 - (sum % 10)) + sum ;
			}
		}
		sum += array[pos];
		System.out.println(sum);
	}
}
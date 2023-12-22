import java.util.Arrays;
import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] array = splitInt(sc.nextLine(), " ");
		int[] array2 = splitInt(sc.nextLine(), " ");
		int sum =0;
		for(int i=0;i<n;i++) {
			if(array[i]>array2[i]) {
				sum += array[i]-array2[i];
			}
		}
		System.out.println(sum);
	}
	public static int[] splitInt(String str, String split) {
		String[] array = str.split(split);
		int[] array2 = new int[array.length];
	
		for(int i=0; i<array.length; i++) {
				array2[i] = Integer.parseInt(array[i]);
		}
		return array2;
	}
}


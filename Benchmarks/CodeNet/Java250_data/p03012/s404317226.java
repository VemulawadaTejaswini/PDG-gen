import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] first = splitInt(sc.nextLine(), " ");
		int[] second = splitInt(sc.nextLine(), " ");
		
		int i= 1;
		int j = first[0]-2;
		int a = second[0];
		int b = second[first[0]-1];
		for(; i<first[0] && j>=0 && i<=j;) {
			if(a>b) {
				b += second[j];
				j--;
			}else {
				a += second[i];
				i++;
			}
		}
		System.out.println(Math.abs(a-b));
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
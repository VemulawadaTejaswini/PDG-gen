import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static String a;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		show(a,n);
		insertionSort(a,n);
		
	}
	static void show(int[] a, int n) {
		System.out.print(a[0]);
		for(int i = 1; i < n; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
	static void insertionSort(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int v = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > v) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = v;
			show(a,n);
		}
	}
}
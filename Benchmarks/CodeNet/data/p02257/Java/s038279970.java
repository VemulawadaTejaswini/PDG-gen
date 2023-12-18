import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static String a;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makePrimeList(100000000);
		int n = stdIn.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(list.contains(stdIn.nextInt())) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void makePrimeList(int n) {
		boolean[] isntBoolean = new boolean[n];
		isntBoolean[0] = isntBoolean[1] = true;
		list.add(2);
		for(int i = 3; i < n; i+=2) {
			if(!isntBoolean[i]) {
				list.add(i);
				for(int j = i + i; j < n; j += i){
					isntBoolean[j] = true;
				}
			}
		}
	}
}
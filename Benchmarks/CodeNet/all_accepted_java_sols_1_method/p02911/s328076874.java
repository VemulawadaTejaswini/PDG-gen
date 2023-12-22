import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			int N = scan.nextInt();
			int P = scan.nextInt();
			int Q = scan.nextInt();
			int[] score = new int[N];
			
			for (int i = 0; i < N; i++) {
				score[i]=P-Q;
			}
			
			for (int i = 0; i < Q; i++) {
				int a = scan.nextInt();
				score[a-1]++;
			}

			for (int i = 0; i < N; i++) {
				if(score[i] > 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");					
				}
			}
			

		}
	}
}
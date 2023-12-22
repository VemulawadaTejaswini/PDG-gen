import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = (B/K)*K;
		
		if(A <= C) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}

}
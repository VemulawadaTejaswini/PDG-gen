import java.util.*;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<String> caca = new PriorityQueue<String>();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int n2 = scn.nextInt();
		for(int i = 0;i<n;i++)caca.add(scn.next());
		for(int i = 0;i<n;i++)System.out.print(caca.poll());
		System.out.println();
		scn.close();
	}
}
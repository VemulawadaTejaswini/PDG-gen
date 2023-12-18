import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] BST = new int[n + 1];
		for(int i = 1; i <= n; i ++) {
			BST[i] = in.nextInt();
		}
		in.close();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("node " + i + ": "
					+ "key = " + BST[i] + ", ");
			if (i != 1) {
				System.out.print("parent key = " + BST[i/2] + ", ");
			} 
			if ((2 * i) <= n) {
				System.out.print("left key = " + BST[2*i] + ", ");
			}
			if ((2 * i) + 1 <= n) {
				System.out.print("right key = " + BST[(2*i)+1] + ", ");
			}
			System.out.println("");
		}
		
	}
}

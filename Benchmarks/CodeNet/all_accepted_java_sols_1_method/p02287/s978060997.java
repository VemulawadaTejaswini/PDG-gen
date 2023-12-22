import java.util.Scanner;
import java.*;


public class Main {
	public static void main(String[] argv) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] tree = new int[n];
		for(int i = 0; i < n; i ++) {
			tree[i] = in.nextInt();
//			System.out.println(tree[i]);
		}
		for(int i = 0; i < n; i ++) {
			System.out.print("node " + (i+1) + ": key = " + tree[i] + ", ");
			if(i!=0)
			{
				System.out.print("parent key = " + tree[(int)Math.floor((i+1)/2)-1] + ", ");
			}
			if(2*(i+1)<=n)
			{
				System.out.print("left key = " + tree[2*(i+1)-1] + ", ");
			}
			if(2*(i+1)+1<=n)
			{
				System.out.print("right key = " + tree[2*(i+1)] + ", ");
			}
			System.out.println("");
		}
		in.close();
	}
}

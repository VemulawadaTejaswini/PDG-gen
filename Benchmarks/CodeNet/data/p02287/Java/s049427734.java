
import java.util.*;
import java.lang.Math; 


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int[] values = new int[count];
		for(int i = 0; i<count; i++) {
			values[i] = scan.nextInt();
		}
		
		// root
		//System.out.println("node 1: key = " + values[0] + ", ");
		for(int i=1; i<=count; i++) {
			System.out.print("node " + (i) + ": key = " + values[i-1] + ", ");
			if(i > 1) {
				int parentpos = (int) Math.sqrt((i));
				System.out.print("parent key = " + values[(i/2)-1] + ", ");
			}
			
			//int levels = (int) Math.ceil(Math.sqrt(17));
			int lchild = 2*i;
			int rchild = 2*i + 1;
			if(lchild <= count) {
				System.out.print("left key = " + values[lchild-1] + ", ");
			}
			if(rchild <= count) {
				System.out.print("right key = " + values[rchild-1] + ", ");
			}
			//if(i<count) {
			System.out.println("");
			//}
		}
		
	}
}


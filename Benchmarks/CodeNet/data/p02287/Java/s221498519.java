import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] binary_heap = new int[n];
		for (int i = 0; i < n; i++) {
			binary_heap[i] = in.nextInt();
		}
		in.close();
		
		int lk = 0;
		int rk = 0;

		for (int i =0; i < n; i++) {
			if (i == 0) {
				int key = binary_heap[i];
				int node = i+1;
				if (n > 1) {
					lk = binary_heap[1];
				}
				if (n > 2) {
					rk = binary_heap[2];
				}
				
				if (lk == 0 && rk == 0) {
					System.out.println("node " + node + ": key = " + key + ", ");
				}else if (lk == 0) {
					System.out.println("node " + node + ": key = " + key + ", right key = " + rk + ", ");
				}else if (rk == 0) {
					System.out.println("node " + node + ": key = " + key + ", left key = " + lk + ", ");
				}else {
					System.out.println("node " + node + ": key = " + key + ", left key = " + lk + ", right key = " + rk + ", ");
				}
				lk = 0;
				rk = 0;
			
			}else {
				int node = i + 1;
				int key = binary_heap[node - 1];
				int pk = binary_heap[(int)Math.floor(node/2.) - 1];
				if (node * 2 <= n) {
					lk = binary_heap[2 * node - 1];
				}
				if (node * 2 + 1 <= n) {
					rk = binary_heap[2 * node];
				}
				
				if (lk == 0 && rk == 0) {
					System.out.println("node " + node + ": key = " + key + ", parent key = " + pk + ", ");
				}else if(lk == 0) {
					System.out.println("node " + node + ": key = " + key + ", parent key = " + pk + ", right key = " + rk + ", ");
				}else if(rk == 0) {
					System.out.println("node " + node + ": key = " + key + ", parent key = " + pk + ", left key = " + lk + ", ");
				}else {
					System.out.println("node " + node + ": key = " + key + ", parent key = " + pk + ", left key = " + lk + ", right key = " + rk + ", ");
				}
				lk = 0;
				rk = 0;
			}
		}
	}
}


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] heap = new int[n];
		for(int i = 0; i < n; i ++) {
			heap[i]=in.nextInt();
		}
		in.close();
		
		for(int i=0; i<heap.length;i++) {
			int nodeNum = i+1;
			
			System.out.print("node "+ nodeNum +": key = "+heap[i]+", ");
			
			if(i>0) {
				System.out.print("parent key = "+ heap[nodeNum/2-1]+", ");
			}
			if(2*nodeNum<=n) {
				System.out.print("left key = "+ heap[2*nodeNum-1]+", ");
			}
			if(2*nodeNum+1<=n) {
				System.out.print("right key = "+ heap[2*nodeNum]+", ");
			}
				
			System.out.println();
		}
	}
}

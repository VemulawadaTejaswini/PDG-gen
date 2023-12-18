import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.nextLine());
		int heap[] = new int[size];
		String inputString[] = s.nextLine().split(" ");
		for (int i = 0; i < size; i++) {
			heap[i] = Integer.parseInt(inputString[i]);
		
		}
		System.out.println("node 1: key = "+heap[0]+", left key = "+heap[1]+", right key = "+heap[2]+ ", ");
		for (int i =1; i < size; i++) {
			System.out.print("node " + (i+1) +":"+ " key = "+heap[i]+", parent key = " + heap[(i-1)/2]+", ");
			if (i*2+1 <= (size-1)) {
			System.out.print("left key = " +heap[i*2+1]+", " );
			}
			if(2*i+2 <=(size-1)) {
			System.out.print("right key = " + heap[2*i+2]+", ");
			}
			System.out.println();
	}

}
}

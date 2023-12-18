
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[in.nextInt() + 1];
		for(int i = 1; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for(int i = 1; i < arr.length; i++) {
			System.out.print("node " + i + ": key = " + arr[i]  + ", ");
			if(i != 1) System.out.print("parent key = " + arr[(i / 2)] + ", ");	
			if(i * 2 < arr.length) System.out.print("left key = " + arr[i * 2] + ", ");
			if(i * 2 + 1 < arr.length) System.out.print("right key = " + arr[(i * 2) + 1] + ", ");
			System.out.print("\n");
		}
	}
}


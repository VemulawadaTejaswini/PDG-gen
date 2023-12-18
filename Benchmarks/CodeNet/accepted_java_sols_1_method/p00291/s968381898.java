import java.util.*;
import java.math.*;
import java.io.*;
 
class Main {
	static final int INF = 2 << 29;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[] {1,5,10,50,100,500};
		int sum = 0;
		for(int i = 0; i < list.length; i++) {
			sum += list[i] * sc.nextInt();
		}
		System.out.println((sum >= 1000)?1:0);

	}
}
             
        
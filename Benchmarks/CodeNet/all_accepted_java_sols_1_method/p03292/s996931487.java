import java.util.*;

public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] data = new int[3];
		for (int i = 0; i < data.length; i++) {
		    data[i] = sc.nextInt();
		}
		Arrays.sort(data);		
		System.out.println(data[2] - data[0]);
	}
}
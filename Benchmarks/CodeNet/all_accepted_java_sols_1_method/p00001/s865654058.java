import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer[] hills = new Integer[10];
		for(int i=0;i<10;i++)
			hills[i]=in.nextInt();
		Arrays.sort(hills, Collections.reverseOrder());
		for(int i=0;i<3;i++)
			System.out.println(hills[i]);
	}
}
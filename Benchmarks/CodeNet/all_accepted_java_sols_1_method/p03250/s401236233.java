import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int ans;
		int[] num = {A,B,C};
		scanner.close();		
	
		Arrays.sort(num);
		System.out.println(num[0]+num[1]+(num[2]*10));		
	}
}
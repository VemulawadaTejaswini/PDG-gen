import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static HashMap<String,String> map = new HashMap<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int time = (Math.abs(Math.min(0, a[0])) * a[2]) + (a[0]<=0?a[3]:0) + ((a[1] - Math.max(a[0], 0)) * a[4]);
		System.out.println(time);
	}
}
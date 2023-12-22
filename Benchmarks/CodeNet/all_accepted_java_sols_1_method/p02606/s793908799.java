import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		int multiplier = 1;
		int ans = 0;
		int temp = d;
		while(temp <= r) {
			temp = d *  multiplier;
			if(temp <= r && temp >= l) {
				ans++;
			}
			multiplier++;
		}
		System.out.println(ans);
	}
}

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int ans = -1;
		
		for(int i = 1;i <= 10000;i ++) {
			if(i * 2 / 25 == a && i / 10 == b) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
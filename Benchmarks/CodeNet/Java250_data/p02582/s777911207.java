import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int ans = 0;
		for(int i = 0; i < 3; i++) {
			int local = 0;
			if(s.charAt(i) == 'R') {
				int j = i;
				local = 0;
				while(j < 3 && s.charAt(j) == 'R') {
					j++;
					local++;
				}
				i = j;
			}
			ans = Math.max(ans, local);
		}
		System.out.println(ans);
	}
}

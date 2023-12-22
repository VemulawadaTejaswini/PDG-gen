import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long i = 1;
		long x = i;
		boolean checkFlg = true;
		while (true) {
			if (checkFlg) {
				x = i;
			}
			if (x % 3 == 0 & checkFlg) {
				System.out.print(" " + i);
				if (++i <= n) {
					checkFlg = true;
					continue;
				} else {
					break;
				}
			}
			
			if (x % 10 == 3) {
				System.out.print(" " + i);
				if (++i <= n) {
					checkFlg = true;
					continue;
				} else {
					break;
				}
			}

			x /= 10;
			if (x != 0) {
				checkFlg = false;
				continue;
			}

			if (++i <= n) {
				checkFlg = true;
				continue;
			} else {
				break;
			}
		}
		System.out.println("");
	}
}
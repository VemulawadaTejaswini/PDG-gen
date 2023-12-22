import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				int n = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));

				for (int i = 1; i <= n; i++) {
					int x = i;
					if (x % 3 == 0) {
						System.out.print(" " + i);
					}
					else {
						if (x % 10 == 3) {
							System.out.print(" " + i);
						}
						else {
							x /= 10;
							if (x % 10 == 3) {
								System.out.print(" " + i);
							}
							else {
								x /= 10;
								if (x % 10 == 3) {
									System.out.print(" " + i);
								}
								else {
									x /= 10;
									if (x % 10 == 3) {
										System.out.print(" " + i);
									}
									else {
										x /= 10;
										if (x % 10 == 3) {
											System.out.print(" " + i);
										}
										else {
											x /= 10;
											if (x % 10 == 3) {
												System.out.print(" " + i);
											}
										}
									}
								}
							}
						}
					}
				}
				System.out.println();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
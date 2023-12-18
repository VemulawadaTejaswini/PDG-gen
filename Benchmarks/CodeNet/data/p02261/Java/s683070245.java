import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lim = Integer.parseInt(in.readLine());

			String[] a = in.readLine().split(" ");
			String[] c = new String[a.length];
			String[] ori = new String[a.length];
				
			for (int i = 0; i < a.length; i++) {
				c[i] = a[i];
				ori[i] = a[i];
			}
			
			for (int i = 0; i < c.length; i++) {
				for (int j = (c.length - 1); j > i; j--) {
					int vala = c[j - 1].charAt(1);
					int valb = c[j].charAt(1);
					
					if (valb < vala) {
						String tmp = c[j];
						c[j] = c[j - 1];
						c[j - 1] = tmp;
					}
				}
			}

			System.out.print(c[0]);
			for (int i = 1; i < c.length; i++) {
				System.out.print(" " + c[i]);
			}
			System.out.println();
			
			boolean flag = true;
			int p = 0;
			for (int j = 1; j < 10; j++) {
				int index = -1;
				while (p < c.length) {
					if (c[p].charAt(1) == (j + '0')) break;

					for (int i = 0; i < ori.length; i++) {
						if (c[p].equals(ori[i])) {
							if (index == -1) {
								index = i;
								break;
							} else if (i < index) {
								System.out.println("Not stable");
								flag = false;
								break;
							}
						}
					}
					p++;
					
					if (flag == false) break;
				}
				if (flag == false) break;
			}
			if (flag) System.out.println("Stable");
			
			for (int i = 0; i < a.length; i++) {
				int mini = i;
				for (int j = i; j < a.length; j++) {
					int vala = a[j].charAt(1);
					int valb = a[mini].charAt(1);
					
					if (vala < valb) {
						mini = j;
					}
				}

				if (i != mini) {
					String tmp = a[i];
					a[i] = a[mini];
					a[mini] = tmp;
				}
			}
			
			System.out.print(a[0]);
			for (int i = 1; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();

			flag = true;
			p = 0;
			for (int j = 1; j < 10; j++) {
				int index = -1;
				while (p < a.length) {
					if (a[p].charAt(1) == (j + '0')) break;

					for (int i = 0; i < ori.length; i++) {
						if (a[p].equals(ori[i])) {
							if (index == -1) {
								index = i;
								break;
							} else if (i < index) {
								System.out.println("Not stable");
								flag = false;
								break;
							}
						}
					}
					p++;
					
					if (flag == false) break;
				}
				if (flag == false) break;
			}
			if (flag) System.out.println("Stable");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int[] a;
	private int[] b;
	
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		int lim = Integer.parseInt(sc.nextLine());
		
		a = new int[lim];		
		b = new int[lim];
		for (int i = 0; i < lim; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = a[i];
		}
		Arrays.sort(b);
		
		int ans = 0;
		for (int i = 0; i < lim; i++) {
			if (a[i] != b[i]) {
				for (int j = (i + 1); j < lim; j++) {
					if ((a[j] == b[i]) && (a[i] == b[j])) {
						a[i] = b[i];
						a[j] = b[j];
						
						ans = ans + a[i] + a[j];
						break;
					}
				}
			}
		}
		
		boolean judge = false;
		while (judge == false) {
			judge = true;
			
			for (int i = 0; i < lim; i++) {
				if (a[i] != b[i]) {
					for (int j = (i + 1); j < lim; j++) {
						if (a[j] != b[j]) {
							int small = -1;
							int large = -1;
							
							for (int k = 0; k < lim; k++) {
								
								if (a[k] == b[i]) {
									small = k;
								} else if (a[k] == b[j]) {
									large = k;
								}
								
								if ((small != -1) && (large != -1)) {
									break;
								}
							}

							if (a[small] == b[j]) {
								a[small] = a[large];
								a[large] = b[j];
								
								ans = ans + a[small] + a[large];
								break;
							}
							if (a[large] == b[i]) {
								a[large] = a[small];
								a[small] = a[i];
								
								ans = ans + a[small] + a[large];
								break;
							}
						}
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] l = new int[n];
		
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		int d = 0;
		int count = 1;
		
		for (int i = 0; i < n;) {
			d = d + l[i];
			if (d <= x) {
				count++;
				i++;
			} else {
              break;
            }
		}
		System.out.println(count);
	}

}


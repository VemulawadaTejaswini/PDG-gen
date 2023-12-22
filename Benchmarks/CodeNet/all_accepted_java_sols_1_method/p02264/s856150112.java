import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, q, sum = 0, num = 0;
		int[] time, end;
		String[] name;
		
		n = scan.nextInt();
		q = scan.nextInt();

		time = new int[n];
		end = new int[n];
		name = new String[n];
		
		for(int i = 0; i < n; i++) {
			name[i] = scan.next();
			time[i] = scan.nextInt();
		}
		
		while(num < n) {
			for(int i = 0; i < n; i++) {
				if(time[i] > 0) {
					if(time[i] <= q) {
						sum += time[i];
						end[num] = i;
						num++;
						time[i] = -sum;
						
					} else {
						time[i] -= q;
						sum += q;
						
					}
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(name[end[i]] + " " + -time[end[i]]);
		}
		
		scan.close();
	}
}
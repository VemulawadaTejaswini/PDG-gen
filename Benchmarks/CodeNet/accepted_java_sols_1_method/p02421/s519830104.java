import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 0;
		int h = 0;
		
		for(int i=0; i < n; i++) {
			String ta = sc.next();
			String ha = sc.next();
			if(ta.compareTo(ha) > 0)
				t += 3;
			else if(ta.compareTo(ha) < 0)
				h += 3;
			else {
				t++;
				h++;
			}
		}
		System.out.println(t + " " + h);
	}
}

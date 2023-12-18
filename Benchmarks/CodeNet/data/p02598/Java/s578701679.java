import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());
		String s = scan.nextLine();
		String[] a = s.split(" ");
		int count = 0;
		int max = 0;

		while(count<k) {
			for(int i=0; i < n; i++) {
				if(max<Integer.parseInt(a[i])) {
					max = i;
				}
			}
			int l = Integer.parseInt(a[max]);
			if(l%2==1) {
				a[max] = Integer.toString(l/2+1);
			}else {
				a[max] = Integer.toString(l/2);
			}
			count++;
		}

		for(int i=0; i < n; i++) {
			if(max<Integer.parseInt(a[i])) {
				max = i;
			}
		}
		System.out.println(a[max]);
		scan.close();
	}

}
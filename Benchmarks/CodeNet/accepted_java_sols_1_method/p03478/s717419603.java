import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();
		sc = null;
		int sum = 0;
		int ab =0;
		for(i=1;i<=n;i++) {
			if(i<10) {
				ab=i;
			} else if(i<100) {
				ab= i/10 + i % 10;
			} else if(i<1000) {
				ab= i / 100 + (i % 100)/10 + i % 10;
			} else  if(i<10000) {
				ab= i / 1000 + (i % 1000)/100 + (i % 100)/10 + i % 10;
			} else {
				ab=1;
			}
			if(a <= ab && ab <= b) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
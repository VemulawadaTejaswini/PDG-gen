import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ST:while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			long[] a = new long[n];
			boolean[] b = new boolean[n];
			boolean lastB = false;
			boolean km = true;
			boolean stop = false;
			for(int i = 0; i < n; i++) {
				String k = stdIn.next();
				if(stop) {
					continue;
				}
				if(k.equals("x")) {
					a[i] = 0L;
					b[i] = true;
					if(lastB) {
						System.out.println("none");
						stop = true;
					}
					lastB = true;
					km = false;
				}
				else {
					
					a[i] = Long.parseLong(k);
					if(!lastB) {
						if(i != 0 && (i+1)%2 == 0) {
							if(a[i-1] >= a[i]) {
								System.out.println("none");
								stop = true;
							}
						}
						else if(i != 0 && (i+1)%2 == 1) {
							if(a[i-1] <= a[i]) {
								System.out.println("none");
								stop = true;
							}
						}
					}
					lastB = false;
				}
			}
			if(stop) {
				continue ST;
			}
			if(km) {
				System.out.println("ambiguous");
				continue ST;
			}
			long max = Long.MAX_VALUE;
			long min = Long.MIN_VALUE;
			for(int i = 0; i < n; i++) {
				if(b[i]) {
					if((i+1)%2 == 0) {
						long an = Long.MIN_VALUE;
						long bn = Long.MIN_VALUE;
						if(i != 0 && !b[i-1]) {
							an = a[i-1];
						}
						if(i != n-1 && !b[i+1]) {
							bn = a[i+1];
						}
						if(min < Math.max(an, bn)) {
							min = Math.max(an, bn);
						}
					}
					else {
						long an = Long.MAX_VALUE;
						long bn = Long.MAX_VALUE;
						if(i != 0 && !b[i-1]) {
							an = a[i-1];
						}
						if(i != n-1 && !b[i+1]) {
							bn = a[i+1];
						}
						if(max > Math.min(an, bn)) {
							max = Math.min(an, bn);
						}
					}
				}
			}
			if(max - min == 2) {
				System.out.println(min+1);
			}
			else if(max - min < 2){
				System.out.println("none");
			}
			else {
				System.out.println("ambiguous");
			}
		}
	}
	
}
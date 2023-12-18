import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ST:while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int[] a = new int[n];
			boolean[] b = new boolean[n];
			boolean lastB = false;
			boolean km = true;
			for(int i = 0; i < n; i++) {
				String k = stdIn.next();
				if(k.equals("x")) {
					a[i] = 0;
					b[i] = true;
					if(lastB) {
						System.out.println("none");
						continue ST;
					}
					lastB = true;
					km = false;
				}
				else {
					
					a[i] = Integer.parseInt(k);
					if(!lastB) {
						if(i != 0 && (i+1)%2 == 0) {
							if(a[i-1] >= a[i]) {
								System.out.println("none");
								continue ST;
							}
						}
						else if(i != 0 && (i+1)%2 == 1) {
							if(a[i-1] <= a[i]) {
								System.out.println("none");
								continue ST;
							}
						}
					}
					lastB = false;
				}
			}
			if(km) {
				System.out.println("ambiguous");
				continue ST;
			}
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				if(b[i]) {
					if((i+1)%2 == 0) {
						int an = Integer.MIN_VALUE;
						int bn = Integer.MIN_VALUE;
						if(i != 0 && !b[i-1]) {
							an = a[i-1];
						}
						if(i != n-1 && !b[i+1]) {
							bn = a[i+1];
						}
						if(min > Math.max(an, bn)) {
							min = Math.max(an, bn)+1;
						}
					}
					else {
						int an = Integer.MAX_VALUE;
						int bn = Integer.MAX_VALUE;
						if(i != 0 && !b[i-1]) {
							an = a[i-1];
						}
						if(i != n-1 && !b[i+1]) {
							bn = a[i+1];
						}
						if(max < Math.min(an, bn)) {
							max = Math.min(an, bn)-1;
						}
					}
				}
			}
			if(min == max) {
				System.out.println(min);
			}
			else if(min > max && a.length != 2){
				System.out.println("none");
			}
			else {
				System.out.println("ambiguous");
			}
		}
	}
	
}
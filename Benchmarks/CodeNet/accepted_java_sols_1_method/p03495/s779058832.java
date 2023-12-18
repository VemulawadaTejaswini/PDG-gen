import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int[] a = new int[n];
	for(int i=0; i<n; i++) {
		a[i] = sc.nextInt();
	}
	int[] b = new int[n+1];
	for(int i=0; i<n; i++) {
		b[a[i]]++;		
	}
	int cout1 = 0;
	for(int i=1; i<n+1; i++) {
		if(b[i] != 0) {
			cout1++;
		}
	}
	int cout2 = 0;
	int[] c = new int[n];
	int j =0;
	if(cout1 <= k) {
		System.out.println(0);
	} else {
		Arrays.sort(b);
		for(int i=0; i<n; i++) {
			if(b[i] != 0) {
				c[j] = b[i];
				j++;
			}
		}
		for(int i=0; i<cout1-k; i++) {
			cout2 += c[i];
		}
		System.out.println(cout2);
	}
}
}

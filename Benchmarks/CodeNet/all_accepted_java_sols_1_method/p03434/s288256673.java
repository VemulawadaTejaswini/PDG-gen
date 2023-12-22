import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	int pointA = 0;
	int pointB = 0;
	for(int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
	}
	Arrays.sort(a);
	int[] b = new int[n];
	for(int i = 0; i < n; i++) {
		b[i] = a[n - i - 1];
	}
	for(int i = 0; i < n; i++) {
		if(i % 2 == 0) {
			pointA += b[i];
		} else {
			pointB += b[i];
		}
	}
	System.out.println(pointA - pointB);
}
}
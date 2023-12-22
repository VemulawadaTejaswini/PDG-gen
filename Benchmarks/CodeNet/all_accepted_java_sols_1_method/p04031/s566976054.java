import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	int x = 40000000;
	int y = 0;
	for(int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
	}
	for(int i = -100; i < 101; i++) {
		for(int j = 0; j < n; j++) {
			y += Math.pow((i - a[j]), 2);
		}
		if(x > y) {
			x = y;
		}
		y = 0;
	}
	System.out.println(x);
}
}
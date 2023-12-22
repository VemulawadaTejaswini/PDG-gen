import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		int[] t = new int[n];
		int sumW = 0;
		int sumT = 0;
		for(int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
			sumW += w[i];
		}
		for(int i = 0; i < w.length; i++) {
			sumT += w[i];
			t[i] = Math.abs((sumW-sumT) - sumT);
		}
		int min = 100000;
		for(int i = 0; i < t.length ; i++) {
			if(t[i] < min) {
				min = t[i];
			}
		}
		System.out.println(min);
	}
}
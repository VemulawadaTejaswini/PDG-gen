import java.util.Scanner;

public class Main {
	static int[] ary;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < n-2; i++){
			if(check(ary[i], ary[i + 1], ary[i + 2])){
				count++;
			}
		}
		System.out.println(count);
	}
	static boolean check(int a, int b, int c){
		return (Math.max(a, Math.max(b, c)) != b)
				&& (Math.min(a, Math.min(b, c)) != b);
	}
}

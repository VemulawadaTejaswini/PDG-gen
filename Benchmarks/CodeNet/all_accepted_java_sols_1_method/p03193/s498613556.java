import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), H = sc.nextInt(), W = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt(), B = sc.nextInt();
			if(H <= A && W <= B) ans++;
		}
		System.out.println(ans);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int left = 1, right = N;
		for(int i = 1; i <= M; i++){
			int li = sc.nextInt();
			int ri = sc.nextInt();
			left = Math.max(left, li);
			right = Math.min(right, ri);
		}
		
		if(right < left) System.out.println(0);
		else System.out.println(right - left + 1);
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int X = sc.nextInt();
			int T = sc.nextInt();
			int cnt = N/X;
			
			if(Math.floorMod(N,X)!=0) {
				cnt++;
			}
			
			
			System.out.println(T*cnt);
	}	
}
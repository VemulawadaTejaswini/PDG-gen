import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int R = sc.nextInt(), G = sc.nextInt(), B = sc.nextInt(), N = sc.nextInt();
			int ans = 0;
			for(int r = 0; r <= N; r++) {
				for(int g = 0; g <= N; g++) {
					if((N - R * r - G * g) % B == 0 && (N - R * r - G * g) >= 0) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
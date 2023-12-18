import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int ans = 0;
		for (int i = 1; i < 6; ++i) {
			System.out.println(0);
		}
		int xyz = 0;
		double t=0;
		for (int i = 6; i <= N; ++i) {
			ans = 0;
			t = Math.sqrt(i);
			for (int x = 1; x < t; ++x) {
				for (int y = 1; y < t; ++y) {
					for (int z = 1; z < t; ++z) {
						xyz = (x + y + z) * (x + y + z) - (x * y + y * z + z * x);
						if (xyz == i) {
							ans++;
							//System.out.println(" ["+i+"]"+x+","+y+","+z);
						}
					}
				}
			}
			//System.out.println("["+i+"]"+ans);
			System.out.println(ans);
		}
	}
}

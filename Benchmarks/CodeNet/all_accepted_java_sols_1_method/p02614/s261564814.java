import java.util.Scanner;



public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] color = new char[h][w];
		int ans = 0;
 
		for(int i = 0; i < h; i++) {
			color[i] = sc.next().toCharArray();
		}
		
		for(int i = 0; i < Math.pow(2, h); i++) {
			for(int j = 0; j < Math.pow(2, w); j++) {

				int count = 0;
				for(int x = 0; x < h; x++) {
					for(int y = 0; y < w; y++) {
						
						if(((i >> x) & 1) == 0 && ((j >> y) & 1) == 0
								&& color[x][y] == '#') {
							count++;
						}
					}
				}
				
				if(count == k) {
					ans++;
				}
			}
		}
		

		
		System.out.println(ans);
		sc.close();
	}

}
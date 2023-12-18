import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int H  = keyboard.nextInt();
		int W  = keyboard.nextInt();
		int K  = keyboard.nextInt();
		
		String m = "";
		char[][] masu = new char[H][W];
		
		
		for(int i=0; i<H; i++) {
			m = keyboard.next();
			for(int j=0; j<W;j++) {
				masu[i][j] = m.charAt(j);
			}
		}
		
		int ans = 0;
		int conH = 1 << H;
		int conW = 1 << W;
		
		for(int Hnuru=0; Hnuru<conH; Hnuru++) {
			for(int Wnuru=0; Wnuru<conW; Wnuru++) {
				int count = 0;
				char[][] masu2 = new char[H][W];
				for(int gyou=0; gyou<H; gyou++) {
					for(int retu=0; retu<W; retu++) {
						if((Hnuru >> gyou) %2 == 1 || (Wnuru >> retu) %2 == 1) {
							masu2[gyou][retu] = '.';
						}
						else {
							masu2[gyou][retu] = masu[gyou][retu];
						}
						if(masu2[gyou][retu] == '#') {
							count++;
						}
						
					}
				}
				if(count == K) {
					ans++;
				}
				
			} 
		}
		
		
		System.out.print(ans);
		keyboard.close();	
	}
}

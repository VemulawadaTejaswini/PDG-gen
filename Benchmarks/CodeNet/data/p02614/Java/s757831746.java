import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), k = sc.nextInt();
		String c[] = new String[h];
		for (int i = 0; i < h; ++i)
			c[i] = sc.next();
		sc.close();
		int black = 0, ans = 0;
		for(int maski = 0; maski < (1 << w); ++maski){
			for(int maskj = 0; maskj < (1 << h); ++maskj){
				black = 0;
				for(int i = 0; i < w; ++i){
					for(int j = 0; j < h; ++j){
						if((maski & (1 << i)) == 0 && (maskj & (1 << j)) == 0){
							if(c[i].charAt(j) == '#')
							black++;
						}
					}
				}
				if(black == k)ans++;
			}
		}
		System.out.println(ans);
	}
}

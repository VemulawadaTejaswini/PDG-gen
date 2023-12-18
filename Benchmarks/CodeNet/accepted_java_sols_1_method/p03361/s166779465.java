import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(),
			w = sc.nextInt();
		String[] s = new String[h];
		for(int i = 0; i < h; i++) {
			s[i] = sc.next();
		}

		int[] uD = {1, 0, -1, 0};
		int[] lR = {0, 1, 0, -1};
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(s[i].charAt(j) == '#'){
					for(int k = 0; k < 4; k++) {
							if(0 <= i + uD[k] && i + uD[k] < h
								&& 0 <= j + lR[k] && j + lR[k] < w
								&& s[i + uD[k]].charAt(j + lR[k]) == '#') {
								break;
							}
							if(k == 3) {
								System.out.println("No");
								return;
							}
					}		
				}

			}
		}
			System.out.println("Yes");
	}
}
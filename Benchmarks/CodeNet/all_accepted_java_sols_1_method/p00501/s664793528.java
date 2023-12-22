import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int idx = -1;
		int n = sc.nextInt();
		String boad = sc.next();
		for(int i = 0; i < n; i++) {
			String old = sc.next();
			for(int k = 0; k < old.length(); k++) {
					if(idx == i) break;
						if(boad.charAt(0) == old.charAt(k)) {//1文字目が一致
							for(int a = k+1; a < old.length(); a++) {
								if(idx == i) break;
								if(boad.charAt(1) == old.charAt(a)) {//2文字目が一致
									int space = a-k;
									int at = 2;
										for(int c = a+space; c < old.length(); c += space) {
											if(boad.charAt(at) == old.charAt(c)) {
												if(at == boad.length()-1 && i != idx) {
													cnt++;
													idx = i;
													break;
												} 
												at++;
											} else {
												break;
											}
										}
								}
							}
						}		
				}
		}
		System.out.println(cnt);
	}
}
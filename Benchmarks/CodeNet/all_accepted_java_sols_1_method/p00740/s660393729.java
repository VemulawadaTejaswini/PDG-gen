import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int p = stdIn.nextInt();
			if(n == 0 && p == 0) break;
			int[] tmp = new int[n];
			int nowp = 0;
			int nowc = p;
			while(true) {
				if(nowc > 1) {
					nowc--;
					tmp[nowp++]++;
				}
				else if(nowc == 0){
					nowc = tmp[nowp];
					tmp[nowp++] = 0;
				}
				else {
					boolean cont = true;
					for(int i = 0; i < n; i++) {
						if(i == nowp) continue;
						if(tmp[i] != 0) {
							cont = false;
							break;
						}
					}
					if(cont) {
						break;
					}
					nowc--;
					tmp[nowp++]++;
				}
				if(nowp >= n) {
					nowp = 0;
				}
			}
			System.out.println(nowp);
			
		}
	}

}
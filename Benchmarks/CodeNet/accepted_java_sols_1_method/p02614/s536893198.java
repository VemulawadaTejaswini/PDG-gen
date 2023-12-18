import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		String[] s = new String[h];
		for(int i = 0;i < h; i++) {
			s[i] = sc.next();
		}
		for(int is = 0; is < (1<<h); is++) {
			for(int js = 0; js < (1<<w); js++) {
				int count = 0;
				for(int i = 0; i < h; i++) {
					for(int j = 0; j < w; j++) {
						if(((is>>i) & 1)==1) {
							continue;
						}
						if(((js>>j)&1)==1){
							continue;
						}
						if(s[i].charAt(j)=='#') {
							count++;
						}
					}
				}
				if(count == k ) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
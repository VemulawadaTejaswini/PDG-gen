import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int K = sc.nextInt();
		char[][] arr = new char[h][w];
		for(int i=0;i<h;i++){
			String s = sc.next();
			for(int j=0;j<s.length();j++){
				arr[i][j]=s.charAt(j);
			}
		}
		int ans=0;
		for(int i=0;i<(1<<h);i++){
			for(int j=0;j<(1<<w);j++){
				int black=0;
				for(int k=0;k<h;k++) {
					for(int l=0;l<w;l++) {
						if(((i>>k)&1)==0 && ((j>>l)&1)==0 && arr[k][l]=='#') {
							black++;
						}
					}
				}
				if(black==K){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}

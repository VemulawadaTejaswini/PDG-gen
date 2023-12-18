import java.util.Scanner;

/* Signboard */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 看板の枚数
        String name = sc.next(); // 店名
        int cnt=0;
        for(int i=0;i<n;i++) {
            String str = sc.next();
            label: for(int j=0; j<str.length(); j++) { // 最初の文字がある位置を探索(jが最初の文字の位置)
                if(str.charAt(j)!=name.charAt(0)) continue;
                for(int k=j+1;k<str.length();k++) { // 2文字目がある位置を探索(kが2文字目の位置)
                	if(str.charAt(k)!=name.charAt(1)) continue;
                	int dist=k-j; // 文字間隔
                	// System.out.println("dist->"+dist);
                    for(int l=k+dist;l<str.length();l+=dist) { // 文字列strをdistごとに探索
                    	int m=2; // nameの3文字目を探索
                    	if(str.charAt(l)!=name.charAt(m)) break;
                    	else {
                    		if(m==name.length()-1) {
                    			cnt++;
                    			break label;
                    		}
                    		m++;
                    	}
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
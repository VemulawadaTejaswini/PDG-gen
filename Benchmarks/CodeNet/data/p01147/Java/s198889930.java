import java.util.BitSet;
import java.util.Scanner;

public class Main{
	public static char[][] s;
	public static int[][] map;
	public static int n;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			n = in.nextInt();
			if(n == 0) break;
			s = new char[n][];
			for(int i=0; i<n; i++){
				s[i] = in.next().toCharArray();
			}
			map = new int[n][n];
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i==j) continue;
					map[i][j] = 0;
					for(int k=0; k<s[i].length; k++){
						boolean flag = true;
						int max = Math.min(s[i].length-k
								, s[j].length);
						for(int l=0; l<max; l++){
							if(s[i][l+k]!=s[j][l]){
								flag = false;
							}
						}
						if(flag){
							map[i][j] = s[i].length-k;
							break;
						}
					}
				}
			}
			max = n;
			res = Integer.MAX_VALUE;
			outPerm(max);
			System.out.println(resstr);
		}
	}
	
	public static int max; // maxPn
	public static void outPerm(int n){
		int[] p = new int[n];
		BitSet used = new BitSet(n);
		for(int i=0; i<n; i++){
			used.set(i);
			perm(i, 1, used, String.valueOf(s[i]));
			used.clear(i);
		}
	}
	
	public static int res;
	public static String resstr;
	public static void perm(int back, int idx, BitSet used, String str){
		if(idx==max){
			if(res > str.length()){
				res = str.length();
				resstr = str;
			}
			return;
		}
		for(int i=used.nextClearBit(0); i!=-1 && i<max; i=used.nextClearBit(i+1)){
			used.set(i);
			String next = str+(map[back][i]<s[i].length
					? String.valueOf(s[i]).substring(map[back][i], s[i].length)
					: "");
			perm(i, idx+1, used, next);
			used.clear(i);
		}
	}
	
	public static void out(int[] p){
		for(int i=0; i<p.length; i++){
			System.out.print(p[i]);
		}
		System.out.println();
	}
}
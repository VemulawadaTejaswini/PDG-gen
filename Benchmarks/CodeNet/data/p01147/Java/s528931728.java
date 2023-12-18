import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static char[][] s;
	public static int[][] map;
	public static int n;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Comp cmp = new Comp();
		while(true){
			n = in.nextInt();
			if(n == 0) break;
			s = new char[n][];
			for(int i=0; i<n; i++){
				s[i] = in.next().toCharArray();
			}
			Arrays.sort(s, cmp);
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
	
	public static String toStr(int[] arr){
		String str = "";
		for(int i=0; i<n; i++){
			if(i==0){
				str = String.valueOf(s[arr[i]]);
				continue;
			}
			int bk = arr[i-1];
			int nx = arr[i];
			if(map[bk][nx] < s[nx].length){
				str += String.valueOf(s[nx]).substring(map[bk][nx], s[nx].length);
			}
		}
		return str;
	}
	
	public static int max; // maxPn
	public static void outPerm(int n){
		int[] p = new int[n];
		BitSet used = new BitSet(n);
		for(int i=0; i<n; i++){
			used.set(i);
			p[0] = i;
			perm(p, i, 1, used, String.valueOf(s[i]).length());
			used.clear(i);
		}
	}
	
	public static int res;
//	public static int[] resarr;
	public static String resstr;
	public static void perm(int[] p, int back, int idx, BitSet used, int len){
		if(idx==max){
			if(res > len){
//				resarr = p.clone();
				res = len;
				resstr = toStr(p);
			}else if(res == len){
				String str = toStr(p);
				if(str.compareTo(resstr) < 0){
					resstr = str;
				}
			}
			return;
		}
		for(int i=used.nextClearBit(0); i!=-1 && i<max; i=used.nextClearBit(i+1)){
			used.set(i);
			p[idx] = i;
			perm(p, i, idx+1, used, len + (map[back][i] < s[i].length ? s[i].length-map[back][i] : 0));
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

class Comp implements Comparator<char[]>{
	@Override
	public int compare(char[] o1, char[] o2) {
		return String.valueOf(o1).compareTo(String.valueOf(o2)) ;
	}
}
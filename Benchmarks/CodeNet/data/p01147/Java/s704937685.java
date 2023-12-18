import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static char[][] s;
	public static int[][] map = new int[10][10];
	public static int n;
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
//		Comp cmp = new Comp();
//		ContestWriter out = new ContestWriter("out.dat");
		while(true){
			n = in.nextInt();
			if(n == 0) break;
			s = new char[n][];
			for(int i=0; i<n; i++){
				s[i] = in.next().toCharArray();
			}
//			Arrays.sort(s, cmp);
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
//			out.println(resstr);
		}
//		out.close();
	}
	
	public static String toStr(int[] arr){
		String str = "";
		for(int i=0; i<n; i++){
			if(i==0){
				str = String.valueOf(s[arr[i]]);
				continue;
			}else if(arr[i] == -1) continue;
			int bk = 0;
			for(int j=i-1; j>=0; j--){
				if(arr[j] == -1) continue;
				bk = arr[j];
				break;
			}
			int nx = arr[i];
			if(map[bk][nx] < s[nx].length){
				str += String.valueOf(s[nx]).substring(map[bk][nx], s[nx].length);
			}
		}
		return str;
	}
	
	public static int max; // maxPn
	public static int[] p = new int[10];
	public static BitSet used = new BitSet(10);
	public static void outPerm(int n){
		used.clear();
		for(int i=0; i<n; i++){
			used.set(i);
			p[0] = i;
			perm(p, i, 1, used, s[i].length);
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
			}
			else if(res == len){
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
			if(map[back][i] < s[i].length){
				p[idx] = i;
				perm(p, i, idx+1, used, len+s[i].length-map[back][i]);
			}else{
				p[idx] = -1;
				perm(p, back, idx+1, used, len);
			}
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
//
//class Comp implements Comparator<char[]>{
//	@Override
//	public int compare(char[] o1, char[] o2) {
//		return String.valueOf(o1).compareTo(String.valueOf(o2)) ;
//	}
//}


class ContestWriter {
	private PrintWriter out;

	public ContestWriter(String filename) throws IOException {
		out = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
	}

	public ContestWriter() throws IOException {
		out = new PrintWriter(System.out);
	}

	public void println(String str) {
		out.println(str);
	}
	
	public void println(Object obj) {
		out.println(obj);
	}

	public void print(String str) {
		out.print(str);
	}
	
	public void print(Object obj) {
		out.print(obj);
	}

	public void close() {
		out.close();
	}
}
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap hs = new HashMap();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> la = new ArrayList<Integer>();
		PrintWriter ou = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[][] c = new int[h][w];
		for(int i = 0 ; i < h ; i++){
			Arrays.fill(c[i] , 0);
			String s = sc.next();
			for(int j = 0 ; j < w ; j++){
				if(s.charAt(j) == '#') c[i][j] = 1;
			}
		}
		sc.close();
		long ans = 0;
		for(int i = 0 ; i < 1 << h ; i++){
			al.clear();
			for(int j = 0 ; j < h ; j++){
				if((1 & i >> j) == 1) al.add(j);
			}
			for(int j = 0 ; j < 1 << w ; j++){
				la.clear();
			    for(int kk = 0 ; kk < w ; kk++){
					if((1 & j  >> kk) == 1) la.add(kk);
				}
				int yono = 0;
				for(int ebi = 0 ; ebi < h ; ebi++){
					for(int shu = 0 ; shu < w ; shu++){
						if(c[ebi][shu] == 1 && al.contains(ebi) && la.contains(shu))yono++;
					}
				}
				if(yono == k) ans++;
			}
		}
		ou.print(ans + "\n");
		ou.flush();
	}
}
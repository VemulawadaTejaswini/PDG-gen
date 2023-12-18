
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main p = new Main();
	}

	int h;
	int w;
	StringBuilder map;
	List<int[]> c;
	public Main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			c = new LinkedList<int[]>();
			h = sc.nextInt();
			w = sc.nextInt();
			map = new StringBuilder();
			for(int j=0;j<h;j++)
				map.append(sc.next());
			
			System.out.println(solve() ? "SAFE" : "SUSPICIOUS");
		}
		
	}

	public boolean solve() {
		int[][] alpha = new int[26][5];
		for(int i=0;i<alpha.length;i++){
			alpha[i][1] = alpha[i][2] = 10000000;
		}
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				int ch = map.charAt(i*w+j) - 'A';
				if(ch+'A'=='.')
					continue;
				
				alpha[ch][0]++;
				alpha[ch][1] = Math.min(alpha[ch][1], i);
				alpha[ch][2] = Math.min(alpha[ch][2], j);
				alpha[ch][3] = Math.max(alpha[ch][3], i);
				alpha[ch][4] = Math.max(alpha[ch][4], j);
				
			}
		}
		for(int i=0;i<alpha.length;i++){
			if(alpha[i][0]>0){
				alpha[i][0] = i+'A';
				c.add(alpha[i]);
			}
		}
		
		int cur = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<h*w;i++)
			sb.append('.');
		return rec(cur, sb);
		
	}

	private boolean rec(int cur, StringBuilder sb) {
		if(cur == (1<<c.size())-1)
			return isOk(sb);
		
		boolean res = false;
		
		for(int i=0;i<c.size();i++){
			if(((1<<i) & cur) > 0)
				continue;
			
			int[] ca = c.get(i);
			char ch = (char) ca[0];
			for(int j=ca[1];j<=ca[3];j++){
				for(int k=ca[2];k<=ca[4];k++){
					sb.setCharAt(j*w+k, ch);
				}
			}
			res |= rec(cur|(1<<i), sb);
		}
		
		return res;
	}

	private boolean isOk(StringBuilder sb) {
		for(int i=0;i<sb.length();i++)
			if(map.charAt(i) != sb.charAt(i))
				return false;
		
		return true;
	}

}
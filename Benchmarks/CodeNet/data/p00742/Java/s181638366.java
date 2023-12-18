import java.util.*;

public class Main{
	int n, cnt, cnum, maxlen;
	ArrayList<Character> clist, tlist;
	char[][] c;
	String[] s;
	int[] b;
	
	
	void check(int[] perm){	
		int ten = 1;
		int suma = 0;
		int sumb = 0;
		for(int i=0;i<maxlen;i++){
			sumb = 0;
			for(int j=n-b[i];j<n;j++){
				if(j==n-1) sumb -= perm[clist.indexOf(c[j][i])];
				else sumb += perm[clist.indexOf(c[j][i])];
			}
			suma += sumb*ten;
			ten *= 10;
		}
		if(suma==0) cnt++;
	}
	
	void makeperm(int k, int[] perm, boolean[] flag){
		if(k==cnum){
			check(perm);
		}else{
			for(int i=0;i<10;i++){
				if(flag[i]==true || (i==0 && tlist.contains(clist.get(k))==true)) continue;
				perm[k] = i;
				flag[i] = true;
				makeperm(k+1, perm, flag);
				flag[i] = false;
			}
		}
	}
	
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			s = new String[n];
			for(int i=0;i<n-1;i++) s[i] = sc.next();
			s[n-1] = "xxxxxxxxxx";
			Arrays.sort(s, new Comparator<String>(){
				public int compare(String o1, String o2){
					return o1.length() - o2.length();
				}
			});
			s[n-1] = sc.next();
			
			if(s[n-1].length()<s[n-2].length() || s[n-1].length()>s[n-2].length()+2){
				System.out.println(0);
			}else{
				clist = new ArrayList<Character>();
				tlist = new ArrayList<Character>();
				c = new char[n][];
				maxlen = s[n-1].length();
				b = new int[maxlen];
				
				for(int i=0;i<n;i++){
					char[] tmp = s[i].toCharArray();
					c[i] = new char[tmp.length];
					for(int j=0;j<tmp.length;j++){
						if(j==0 && tmp.length>1 && tlist.contains(tmp[j])==false) tlist.add(tmp[j]);
						if(clist.contains(tmp[j])==false) clist.add(tmp[j]);
						c[i][tmp.length-1-j] = tmp[j];
						b[j]++;
					}
				}
				
				cnum = clist.size();
				cnt = 0;
				makeperm(0, new int[cnum], new boolean[10]);
				System.out.println(cnt);
			}			
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}
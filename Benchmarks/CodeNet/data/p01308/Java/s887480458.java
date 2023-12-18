import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Angel Stairs
public class Main{

	void run(){
		String[] M = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0){
			int n = sc.nextInt(), m =  sc.nextInt();
			int[] s = new int[n+2], t = new int[m];
			for(int i=1;i<=n;i++){
				String r = sc.next();
				for(int k=0;k<12;k++)if(M[k].equals(r)){s[i]=k; break;};
			}
			for(int i=0;i<m;i++){
				String r = sc.next();
				for(int k=0;k<12;k++)if(M[k].equals(r)){t[i]=k; break;};
			}
			Set<Integer> set = new HashSet<Integer>();
			set.add(0);
			int k = 0;
			String res = "No";
			while(!set.isEmpty()&&k<=m){
				Set<Integer> next = new HashSet<Integer>();
				for(int v:set){
					if(k==m){
						if(v+1==n+1||v+2==n+1)res = "Yes";
						continue;
					}
					if(v-1>0&&t[k]==(s[v-1]+11)%12)next.add(v-1);
					if(v+1<=n&&t[k]==s[v+1])next.add(v+1);
					if(v+2<=n&&t[k]==(s[v+2]+1)%12)next.add(v+2);
				}
				set = next; k++;
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
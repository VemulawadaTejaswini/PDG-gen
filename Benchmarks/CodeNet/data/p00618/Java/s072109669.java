import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Course Planning for Lazy Students
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int u = sc.nextInt();
			if((n|u)==0)break;
			int[] c = new int[n];
			int[] r = new int[n];
			for(int i=0;i<n;i++){
				c[i] = sc.nextInt();
				int x = 0;
				int k = sc.nextInt();
				for(int j=0;j<k;j++)x|=(1<<sc.nextInt());
				r[i] = x;
			}
			Set<Integer> s = new HashSet<Integer>();
			for(int i=0;i<n;i++){
				if(r[i]==0)s.add(1<<i);
			}
			int ans = 1;
			while(!s.isEmpty()){
				Set<Integer> next = new HashSet<Integer>();
				for(int v:s){
					int sum = 0;
					for(int i=0;i<n;i++){
						if((v&(1<<i))>0){
							sum += c[i];
							continue;
						}
						if((r[i]&v)==r[i])next.add(v|(1<<i));
					}
					if(u<=sum){
						System.out.println(ans);
						next.clear();
						break;
					}
				}
				ans++;
				s = next;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
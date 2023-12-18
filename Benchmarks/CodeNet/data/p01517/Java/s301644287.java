import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

//The Enemy of My Enemy is My Friend
public class Main{

	Map<String, Integer> ref;
	int ID;
	int reg(String s){
		if(ref.containsKey(s))return ref.get(s);
		ref.put(s, ID);
		return ID++;
	}

	int N, res;
	int[] b;
	Set<Integer>[] adj;
	boolean[] u;

	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			N = sc.nextInt();
			if(N==0)break;
			ref = new HashMap<String, Integer>();
			ID = 0;
			adj = new Set[N];
			b = new int[N];
			for(int i=0;i<N;i++)adj[i]=new HashSet<Integer>();
			for(int i=0;i<N;i++){
				int id = reg(sc.next());
				b[id] = sc.nextInt();
				int c = sc.nextInt();
				while(c--!=0)adj[id].add(reg(sc.next()));
			}
			int[] MASK = new int[N];
			for(int i=0;i<N;i++){
				for(int x:adj[i])MASK[i]+=1<<x;
			}
			res = b[0];
			if(N<=18){
				for(int S=(1<<(N-1))-1;S>0;S--){
					int v = 1+(S<<1), sum = 0;
					for(int i=0;i<N;i++)if(((v>>i)&1)>0)sum+=b[i];
					if(sum<res)continue;
					boolean ok = true;
					for(int i=0;i<N;i++)if(((v>>i)&1)>0&&(MASK[i]&v)!=0)ok=false;
					if(ok)res = sum;
				}
			}
			else{
				int K = 100000;
				Set<Long> u = new HashSet<Long>();
				while(K--!=0){
					long v = 1;
					int sum = 0;;
					Random rand = new Random();
					for(int i=1;i<N;i++)if(rand.nextBoolean()){
						v+=1<<i;
						sum += b[i];
					}
					if(u.contains(v))continue;
					u.add(v);
					if(sum<res)continue;
					boolean ok = true;
					for(int i=0;i<N;i++)if(((v>>i)&1)>0&&(MASK[i]&v)!=0)ok=false;
					if(ok)res=sum;
				}
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
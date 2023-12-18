import java.util.*;
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
    	new B().doIt();
    }
    
    class B{
    	int m,p;
    	boolean[] prime;
    	int N;
    	void solve(){
    		ArrayList<Integer> pp = new ArrayList<Integer>();
    		for(int i=m+1;pp.size()<200&&i<N;i++)if(prime[i])pp.add(i);
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		for(int i=0;i<pp.size();i++)for(int s=i;s>=0;s--)list.add(pp.get(i)+pp.get(s));
    		Collections.sort(list);
//    		System.out.println(list);
    		System.out.println(list.get(p-1));
    	}
    	
    	void doIt(){
    		N = 102000;
    		prime = new boolean[N];
    		Arrays.fill(prime, true);prime[0]=false;prime[1]=false;
    		for(int i=0;i<N;i++)if(prime[i])for(int s=i+i;s<N;s+=i)prime[s]=false;
    		while(in.hasNext()){
    			m = in.nextInt();
    			p = in.nextInt();
    			if(m+p==-2)break;
    			solve();
    		}
    	}
    }
    
}
import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new D(), "RUN", STACK_SIZE).start();
	}
	
	class D implements Runnable{
		D(){}
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		
		int N;
		final int INF=1<<29;
		
		void solve(){
			
			Swimmer[] input=new Swimmer[N];
			for(int i=0; i<N; ++i)	input[i]=new Swimmer( sc.nextInt(), sc.nextInt() );
			Arrays.sort(input);
			
			LinkedList<Swimmer> Q1 = new LinkedList<Swimmer>(),
								Q2 = new LinkedList<Swimmer>();
			for(int i=0; i<N; ++i)	Q1.add( input[i] );
			
			int lane1=0, lane2=0;
			
			ArrayList<Swimmer> tmp = new ArrayList<Swimmer>();
			
			int ans=-1;
			for(int i=0; ; ++i){
				
				int lane=(i%2==0? lane1 : lane2),newLane=INF;
				
				if(Q1.getFirst().t + Q1.getFirst().now > lane){
					
					// trought
					for(Swimmer s: Q1){
						
						if(i%2==0 &&newLane >= s.now){
							--s.c;
							if(s.c < 0){
								ans=max(ans, s.now);
								continue;
							}
						}
						
						if(newLane >= s.now)	s.now+=s.t;
						newLane = s.now;
						
						Q2.add(s);
						
					}
					
				}else{
					
					// block
					while( !Q1.isEmpty() && Q1.getFirst().t + Q1.getFirst().now <= lane ){
						
						Swimmer s=Q1.removeFirst();
						
						if(i%2 == 0){
							--s.c;
							if(s.c < 0)	continue;
						}
						s.now = lane;
						tmp.add(s);
						
					}
					
					
					
					if(!Q1.isEmpty()){
						Swimmer s2 = Q1.removeLast();
						//TODO ayasii
						//s2.now-=lane;
//						if(i%2 == 0){
//							if( s2.t+s2.now <= lane2)	--s2.c;
//						}
						if(s2.c >= 0)	tmp.add(s2);
					}
					
					
					
					
					Collections.sort(tmp);
					Q2.addAll(tmp);
					
					for(Swimmer s: Q1){
						
						if(i%2==0 &&newLane >= s.now){
							--s.c;
							if(s.c < 0){
								ans=max(ans, s.now);
								continue;
							}
						}
						
						if(newLane >= s.now)	s.now+=s.t;
						newLane = s.now;
						
						Q2.addLast(s);
					}
					
				}
				
				if(Q2.isEmpty())	break;
				
				Q1.clear();
				Q1.addAll(Q2);
				Q2.clear();
				tmp.clear();
				
				if(i%2==0)	lane1=(newLane>=INF? lane1 : newLane);
				else		lane2=(newLane>=INF? lane2 : newLane);
				
				//System.out.println(Q1+" "+lane1+" "+lane2);
				
			}
			
			System.out.println(ans);
			
		}
		
		class Swimmer implements Comparable<Swimmer>{
			int t,c,now;
			Swimmer(int t,int c){
				this.t=t;
				this.c=c;
			}
			@Override public int compareTo(Swimmer s){
				return this.t-s.t;
			}
			@Override public String toString(){
				return t+" "+c+" "+now;
			}
		}
		
	}
}
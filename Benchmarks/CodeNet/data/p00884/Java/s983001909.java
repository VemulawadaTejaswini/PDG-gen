import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ1305(), "RUN!", STACK_SIZE).start();
		//new Live5015();
	}
	
	class AOJ1305 implements Runnable{
		int N;
		AOJ1305(){}
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			HashMap<String,HashSet<String>> groups=new HashMap<String,HashSet<String>>();
			String first="";
			for(int i=0; i<N; i++){
				String line=sc.next();
				String[] gn=line.split(":");
				if(i==0)	first=gn[0];
				String[] mem=gn[1].replaceAll("\\.", "").split(",");
				HashSet<String> member=new HashSet<String>();
				for(String s:mem)member.add(s);
				groups.put(gn[0],member);
			}
			
			HashSet<String> ans=recursion(groups,first);
			System.out.println(ans.size());
		}
		HashSet<String> recursion(HashMap<String,HashSet<String>> groups,String target){
			HashSet<String> group=groups.get(target),newGroup=new HashSet<String>();
			newGroup.addAll(group);
			for(String name:group){
				if(groups.containsKey(name)){
					newGroup.remove(name);
					HashSet<String> ret=recursion(groups,name);
					newGroup.addAll(ret);
				}
			}
			groups.remove(target);
			groups.put(target, newGroup);
			return newGroup;
		}
	}
}
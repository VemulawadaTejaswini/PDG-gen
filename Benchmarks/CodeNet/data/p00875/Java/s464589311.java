import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int n;
	HashMap<String, String> map=new HashMap<String, String>();
	String start, end;
	int ans;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			map.clear();
			for(int i=0; i<n; i++){
				String s=sc.next();
				String t=sc.next();
				map.put(s, t);
			}
			start=sc.next();
			end=sc.next();
			ans=-1;
			dfs(start, 0);
			println(""+ans);
		}
	}

	void dfs(String s, int r){
		if(r>=ans&&r>=10){
			return;
		}else if(s.length()>end.length()){
			return;
		}else if(s.equals(end)){
			if(ans==-1||r<ans){
				ans=r;
			}
			return;
		}
		for(Entry<String, String> entry : map.entrySet()){
			if(s.contains(entry.getKey())){
				String t=s.replaceAll(entry.getKey(), entry.getValue());
				dfs(t, r+1);
			}
		}
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();

	}
}
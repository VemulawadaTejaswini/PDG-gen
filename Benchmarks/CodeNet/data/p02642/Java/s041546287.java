import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeMap<Integer,Boolean> map=new TreeMap<>();
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			if(map.containsKey(a)){
				map.put(a,true);
			}else{
				map.put(a,false);
			}
		}
		boolean[] fur=new boolean[200001];
		int ans=0;
		for(int i:map.keySet()){
			if(!fur[i]){
				int mul=1;
				while(200000>=i*mul){
					fur[i*mul]=true;
					mul++;
				}
				if(!map.get(i)){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}

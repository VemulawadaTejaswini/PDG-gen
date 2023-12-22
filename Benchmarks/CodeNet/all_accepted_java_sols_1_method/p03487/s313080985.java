import java.util.HashMap;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		HashMap<Integer,Integer> hs=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			if(!hs.containsKey(a)){
				hs.put(a, 1);
			}else {
				hs.put(a, hs.get(a)+1);
			}
		}
		int ans=0;
		for(Integer key:hs.keySet()) {
			int num=hs.get(key);
			if(key==num||num==0){
			}else if(num>key) {
				ans+=num-key;
			}else {
				ans+=num;
			}
		}
		System.out.println(ans);
	}
}
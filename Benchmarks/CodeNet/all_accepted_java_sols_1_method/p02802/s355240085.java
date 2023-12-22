import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N問
		int M = sc.nextInt(); //M回提出
		//(Pi, penaの数or正解-1)
		Map<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		int pena = 0;
		int p;
		String r;
		int re;
		for(int i = 0; i < M; i++) {
		    p = sc.nextInt();
		    r = sc.next();
		    if(r.equals("AC")) {
		        re = -1;
		    }else {
		        re = 1;
		    }
		     //すでに回答している問題
		    if(map.containsKey(p)) {
		        // WA
		        if(re == 1) {
		            if(map.get(p) != -1) {
		                map.put(p, map.get(p)+1);
		            }
		        //AC
		        }else {
		            //初めて正解
		            if(map.get(p) != -1) {
		                pena += map.get(p);
		                ans++;
		                map.put(p, -1);
	                //すでに正解
		            }
		        }
		    //新しい問題
		    }else {
		        //WA
		        if(re == 1) {
		            map.put(p, 1);
	            //AC
		        }else {
		            map.put(p, -1);
		            ans++;
		        }
		    }
		}
		
		System.out.println(ans+" "+pena);
		
	}
}

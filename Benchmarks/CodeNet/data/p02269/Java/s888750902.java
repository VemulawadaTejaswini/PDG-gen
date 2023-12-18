import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int a=0;a<n;a++){
			String s = sc.next();
			String t = sc.next();
			if(s.charAt(0)=='i'){
				map.put(t, 1);
			}
			else{
				if(map.containsKey(t)){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
			}
		}
	}
}


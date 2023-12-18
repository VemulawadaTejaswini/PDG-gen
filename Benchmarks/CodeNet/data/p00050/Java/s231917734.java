import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static char[] a = "apple".toCharArray();
	static char[] p = "peach".toCharArray();
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		boolean f = false;
		
		for(String v :str){
			if(f){
				System.out.print(" ");
			}else{
				f = true;
			}
			
			// 
			if(v.indexOf("apple") >= 0){
				char[] tmp = v.toCharArray();
				for(int i=0; i<p.length; ++i){
					tmp[i] = p[i];
				}
				System.out.print(new String(tmp));
			}else if(v.indexOf("peach") >=0){
				char[] tmp = v.toCharArray();
				for(int i=0; i<a.length; ++i){
					tmp[i] = a[i];
				}
				System.out.print(new String(tmp));
			}else{
				System.out.print(v);
			}
		}
		
		System.out.print("\n");
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}
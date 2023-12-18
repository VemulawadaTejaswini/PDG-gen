
import java.util.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] in = new int[26];
			int [] out = new int[26];
			for(int i = 0 ; i < n; i++){
				String s = sc.next();
				in[s.charAt(0) - 'a']++;
				out[s.charAt(s.length() - 1) - 'a' ]++;
			}
			boolean res = isOK(in, out);
			System.out.println(res ? "OK" : "NG");
		}
	}
	
	private boolean isOK(int[] in, int[] out) {
		for(int i = 0 ; i < in.length;i++){
			if(in[i] != out[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}
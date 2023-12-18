import java.util.Arrays;
import java.util.Scanner;


class Main{
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(sc.hasNext()){
			char[] str = sc.next().toCharArray();
			
			boolean f = true;
			for(int i=0; i<(str.length+1)/2; ++i){
				int j = str.length-1-i;
				f &= str[i] == str[j];
			}
			if(f) ++count;
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args){
		new Main().solve();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}
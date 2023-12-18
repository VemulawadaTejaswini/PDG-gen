import java.util.Arrays;
import java.util.Scanner;


class Main{
	int[] d;
	
	int solve(){
		for(int i=10; 1<i; --i){
			int[] d_ = new int[i -1];
			for(int j=0; j<i -1; ++j){
				d_[j] = (d[j] + d[j+1])%10;
				
			}
			d = d_;
		}
		
		return d[0];
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String str = sc.next();
			d = new int[10];
			
			for(int i=0; i<10; ++i){
				d[i] = Integer.parseInt(new String(new char[]{str.charAt(i)}));
			}
			
			System.out.println(solve());
		}
	}
	
	public static void main(String[] args){
		new Main().io();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}
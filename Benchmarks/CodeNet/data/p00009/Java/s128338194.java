import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	boolean[] getPrime(final int n){
		boolean[] list = new boolean[n+1];
		for(int i=2; i<=n; ++i){ list[i] = true; }
		for(int i=2; i*i<=n; ++i){
			if(list[i]){
				for(int j=i*2; j<=n; j+=i){
					list[j] = false;
				}
			}
		}
		return list;
	}
	
	int countPrime(final boolean[] list){
		int c=0;
		for(int i=1; i<list.length; ++i){
			if(list[i])++c;
		}
		return c;
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			final int n = sc.nextInt();
			System.out.println(countPrime(getPrime(n)));
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
	
	void debug(Object... os){
		System.out.println(Arrays.deepToString(os));
	}
}
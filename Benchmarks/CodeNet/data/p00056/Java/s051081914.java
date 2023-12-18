import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	boolean[] getPrime(final int n){
		boolean[] list = new boolean[n+1];
		for(int i=2; i<=n; ++i){ list[i] = true;}
		for(int i=2; i*i<=n; ++i){
			if(list[i]){
				for(int j=i*2; j<=n; j+=i){
					list[j] = false;
				}
			}
		}
		return list;
	}
	
	int countGoldbach(final boolean[] map){
		int c=0;
		int target = map.length -1;
		
		for(int i=2; i<=target/2; ++i){
			int j = target - i;
			if(map[i] && map[j])++c;
		}
		
		return c;
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			final int n = sc.nextInt();
			if(n==0)return;
			System.out.println(countGoldbach(getPrime(n)));
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
	
	void debug(Object... os){
		System.out.println(Arrays.deepToString(os));
	}
}
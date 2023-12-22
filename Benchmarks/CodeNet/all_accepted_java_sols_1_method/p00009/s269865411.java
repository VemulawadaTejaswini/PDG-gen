import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, ans, tmp, sqrt;
		boolean[] table;
		while(sc.hasNext()){
			n = sc.nextInt();
			ans = 0;
			table = new boolean[n + 1];
			for(int i = 2; i < n + 1; i++){
				if(!table[i]){
					for(int j = i; j < n + 1; j += i){
						table[j] = true;
					}
					ans++;
				}
			}
			
			System.out.println(ans);
		}
	}
}
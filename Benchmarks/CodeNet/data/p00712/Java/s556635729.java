import java.util.*;


public class Main {
	public static int dfs(int p, int q, int a, int n, int num, int den, int k, int cur){
		if(p * den == q * num){
			return 1;
		}
		if(k == n || p * den < q * num){
			return 0;
		}
		int ret = 0;
		
		for(int i = cur; i * den <= a; i++){
			ret += dfs(p,q,a,n,num*i+den,i*den,k+1,i);
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true){
				int p = sc.nextInt(), q = sc.nextInt(), a = sc.nextInt(), n = sc.nextInt();

				if(p == 0 && q == 0 && a == 0 && n == 0){
					sc.close();
					break;
				}
				System.out.println(dfs(p,q,a,n,0,1,0,1));
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
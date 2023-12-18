import java.util.*;

public class Main {
	int p, q, a, n, c;
	int count = 0;
	
	void loop(int x, int y, int z, int w){
		if(z==c){
			if(p*x==q*y) count++;
			return;
		}
		for(int i=w;x*i<=a;i++) loop(x*i, y*i+x, z+1, i);
	}
	
	void func(){
		for(int i=1;i<=n;i++){
			c = i;
			loop(1,0,0,1);
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
				
			Main A = new Main();
			A.p = sc.nextInt();
			A.q = sc.nextInt();
			A.a = sc.nextInt();
			A.n = sc.nextInt();
			if(A.p==0 && A.q==0 && A.a==0 && A.n==0) break;
			
			A.func();
		}	
	}	
}
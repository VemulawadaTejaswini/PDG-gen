import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();	
	}

	public Main() {
		new aoj0056().doIt();
	}
	class aoj0056 {
		ArrayList<Integer> array = new ArrayList<Integer>();
		void eratos(){ 
			int MAX = 50000;
			boolean [] isprime = new boolean[MAX + 1];
			Arrays.fill(isprime, true);
			isprime[0] = false;
			isprime[1] = false;
			for(int i = 0; i * i <= MAX; i++){
				if(isprime[i]){
					for(int j = i * 2; j <= MAX; j+= i){
    					isprime[j] = false;
    				}
    			}
			}
			for(int i = 0; i <= MAX; i++){
				if(isprime[i])array.add(i);
			}
		}
		int ans[] = new int [50001];
		int ans2[] = new int [50001];
		void DP(){
			for(int i = 0;i < array.size();i++){
				ans2[array.get(i)]++;
			}
			for(int i = 0;i <= array.size();i++){
				for(int j = i;j < array.size();j++){
					if(array.get(i) + array.get(j) <= 50000){
						ans[array.get(i)+array.get(j)] = ans[array.get(i)+array.get(j)] + ans2[array.get(i)];  
					}else break;
				}
			}
		}
		void doIt() {
			eratos();
			DP();
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				System.out.println(ans[n]);
			}
		}
	}
}
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
		int ans(int n){
			int result = 0;
			for(int i = 0;i < array.size();i++){
				for(int j = array.size()-1;j >= i;j--){
					if(array.get(i) + array.get(j) == n)result++;
					if(array.get(i) + array.get(j) < n)break;
				}
			}
			return result;
		}
		void doIt() {
			eratos();
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				System.out.println(ans(n));
			}
		}
	}
}
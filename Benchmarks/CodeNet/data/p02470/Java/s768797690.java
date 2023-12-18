import java.util.*;
//オイラーのφ関数
public class Main{
    public static boolean prime(long n){
    	if(n < 2){
	    return false;
	}
	else if(n == 2){
		return true;
	}
	else{
		if(n % 2 == 0){
			return false;
		}
		else{
			for(int i = 3 ; i <= Math.sqrt(n) ; i++){
				if(n % i == 0){
					return false;
				}
			}
			return true;
		}
	}
    }
    public static void bunnkai(long n, HashMap<Long,Long> hm){
	while(n % 2 == 0){
		if(!hm.containsKey(2L))
			hm.put(2L,1L);
		else
			hm.put(2L,hm.get(2L)+1L);
		n /= 2;
	}
	long res = n;
	for(long i = 3 ; i < Math.sqrt(n) ; i+= 2){
		if(res == 1)
			return;
		else if(prime(i) && res % i == 0){
			while(res % i == 0){
				if(!hm.containsKey(i))
					hm.put(i,1L);
				else
					hm.put(i,hm.get(i)+1L);
				res /= i;
			}
		}
	}
	if(prime(res))
		hm.put(res,1L);
	return;
    }
    public static void main(String[] args){
	HashMap<Long,Long> hm = new HashMap<Long,Long>();
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	bunnkai(n,hm);
	long ans = n;
	for(long key : hm.keySet()){
		ans *= (key-1);
		ans /= key;
	}
	System.out.println(ans);
    }
}

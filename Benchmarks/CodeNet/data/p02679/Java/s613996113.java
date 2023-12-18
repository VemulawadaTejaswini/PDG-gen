import java.util.*;

class Main {
	private static long DIV = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	Map<Double, IntSet> map = new HashMap<>();
    	int a0 = 0;
    	int b0 = 0;
    	int ab0 = 0;
    	for(int i = 0; i < n; i++){
    		long a = sc.nextLong();
    		long b = sc.nextLong();
    		if(a == 0 || b == 0){
    			if(a == 0 && b == 0){
    				ab0++;
    			}else if(a == 0){
    				a0++;
    			}else{
    				b0++;
    			}
    			continue;
    		}
    		double c = 0;
    		if((a < 0 && b < 0) || (a > 0 && b > 0)){
    			c = (double)a / (double)b;
    		}else if((a < 0 && b > 0) || (a > 0 && b < 0)) {
    			c = (double)b / (double)a;
    		}
    		
    		IntSet intSet = map.get(Math.abs(c));
    		if(intSet == null){
    			intSet = new IntSet();
    			map.put(Math.abs(c), intSet);
    		}
    		if(c > 0){
    			intSet.plus++;
    		}else{
    			intSet.minus++;
    		}
    	}
    	long toori = 1;
    	for(Double d : map.keySet()){
    		IntSet intSet = map.get(d);
    		long plus = 1;
    		for(int i = 0; i < intSet.plus; i++) {
    			plus = plus * 2 % DIV;
    		}
    		long minus = 1;
    		for(int i = 0; i < intSet.minus; i++) {
    			minus = minus * 2 % DIV;
    		}
    		toori = toori * ((minus + plus - 1) % DIV) % DIV;
    	}
    	long plus = 1;
    		for(int i = 0; i < a0; i++) {
    			plus = plus * 2 % DIV;
    		}
    		long minus = 1;
    		for(int i = 0; i < b0; i++) {
    			minus = minus * 2 % DIV;
    		}
    		toori = toori * ((minus + plus - 1) % DIV) % DIV;
    	
    	System.out.println((toori - 1) % DIV);
    }
}

class IntSet{
	int plus = 0;
	int minus = 0;
}
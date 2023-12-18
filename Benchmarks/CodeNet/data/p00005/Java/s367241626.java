import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int a;
    	int b;
    	while (scan.hasNextInt()){
    		a = scan.nextInt();
    		b = scan.nextInt();
    		int[] result = doThem(a, b);
    		System.out.println(result[0] + " " + result[1]);
    	}
    }
    
    public static int[] doThem(int a, int b){
    	ArrayList<Integer> comfac = new ArrayList<Integer>();
		
		while (!isprime(a) || !isprime(b)){
			
			int fac;
			if (minfactor(a) == minfactor(b)){
				fac = minfactor(a);
				a = a / fac;
				b = b / fac;
				comfac.add(fac);
			}else if(minfactor(a) < minfactor(b)){
				fac = minfactor(b);
				if(a % fac == 0){
					a = a / fac;
					b = b / fac;
					comfac.add(fac);
				}else{
					fac = 5;
					if(a % fac == 0 && b % 5 == 0){
						a = a / fac;
						b = b / fac;
						comfac.add(fac);
					}else{
						break;
					}
				}
			}else if(minfactor(a) > minfactor(b)){
				fac = minfactor(a);
				if(b % fac == 0){
					a = a / fac;
					b = b / fac;
					comfac.add(fac);
				}else{
					fac = 5;
					if(a % fac == 0 && b % 5 == 0){
						a = a / fac;
						b = b / fac;
						comfac.add(fac);
					}else{
						break;
					}
				}
			}
		}
		
		if(a == b){
			a = a / a;
			b = b / a;
			comfac.add(a);
		}
		
		int[] result = new int[2];
		result[0] = 1; result[1] = 1;
		for(Integer value : comfac){
			result[0] = result[0] * value;
		}
		result[1] = result[0]*a*b;
		return result;
    }
    
    public static int minfactor(int n){
    	if (n % 2 == 0) return 2;
    	if (n % 3 == 0) return 3;
    	if (n % 5 == 0) return 5;
    	
    	int m = 7;
    	while (m*m <= n){
    		if (m*m == n){
    			return m;
    		}
    		m += 2;
    	}
    	
    	return n;
    }
    
    public static boolean isprime(int n){
    	if(minfactor(n) == n){
    		return true;
    	}else{
    		return false;
    	}
    }
}
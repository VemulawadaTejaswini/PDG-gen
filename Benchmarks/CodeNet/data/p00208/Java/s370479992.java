import java.util.*;

class Main {
	
	static long eights[] = new long[20];
	static long tens[]   = new long[20];
	static long coef[]   = {0,1,2,3,3,4,4,5,6,7};

	public static void main(String args[]){
		eights[0] = 1;
		for(int i=1; i<20; i++){
			eights[i] = eights[i-1]*8;
		}
		tens[0] = 1;
		for(int i=1; i<20; i++){
			tens[i] = tens[i-1]*10;
		}
		Scanner in = new Scanner(System.in);
		for(;;){
			long n = in.nextInt();
			if(n==0) return ;
			long low=1, high = 50000000000L, mid=0;
			for(;;){
				mid = getLowerNum((low + high)/2);
				long nn = n + count(mid);
				if(nn == mid){
					break;
				}
				else if(nn>mid){
					low = getUpperNum(mid+1);
				}
				else{
					high = getLowerNum(mid-1);
				}
			}
			System.out.println(mid);
		}
	}

	private static long count(long x){
		long ans = 0;
		for(int d = 0; x/tens[d]>0; d++){
			int dig = (int)(x/tens[d]%10);
			ans += eights[d]*coef[dig];
		}
		return x - ans;
	}
	
	private static long getLowerNum(long x){
		long ans = 0;
		for(int d = 19; d >= 0; d--){
			int dig = (int)((x/tens[d])%10);
			if(dig != 4 && dig != 6){
				ans += tens[d]*dig;
			}
			else{
				ans += dig*tens[d]-1;
				break;
			}
		}
		return ans;
	}

	private static long getUpperNum(long x){
		long ans = 0;
		for(int d = 19; d>=0; d--){
			int dig = (int)((x/tens[d])%10);
			if(dig != 4 && dig!= 6){
				ans += tens[d]*dig;
			}
			else{
				ans += (dig+1)*tens[d];
				break;
			}
		}
		return ans;
	}
}
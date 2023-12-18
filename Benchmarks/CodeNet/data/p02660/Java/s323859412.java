import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int num = 0;
      
		for(long i = 2 ; i < 1000000; i++) {
			if(n == 1) {
				break;
			}
			if(n % i == 0) {
				for(long j = 1 ; j < 21 ; j++) {
					long t = pow(i,i,j);
					if(n % t != 0)
						break;
					n /= t;
					num++;
				}
			}


		}
      if(num == 0){
        long t = (long)Math.sqrt(n);
        for(int i = 2 ; i <= t ; i++){
          if(n % i == 0){
            System.out.println(0);
            return;
          }
          
        }
         System.out.println(1);
        return;
      }
      System.out.println(num);
				return;




	}
	public static long pow(long ml, long a, long b){
    if(b == 1)
      return ml;
      ml *= a;
      b--;
		return b == 0 ? ml : pow(ml , a ,b);

	}

}


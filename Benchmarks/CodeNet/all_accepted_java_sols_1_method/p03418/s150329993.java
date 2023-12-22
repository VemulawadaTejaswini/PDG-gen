import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            long n = Integer.parseInt(sc.next());
            long k = Integer.parseInt(sc.next());
            long ret = 0;
            
            for(int i=(int)k+1; i<=n; i++){

            	ret += (n/i) * (i-k) + Math.max(0, n%i - Math.max(k, 1) + 1);
            	
            }
            
            System.out.println(ret);
            sc.close();
		}
    }
	
import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		outside: for(int i=0; i<=3333; i++){
			for(int j=0; j<=3333; j++){
				long li = (long)i;
				long lj = (long)j;
				long A5 = li*li*li*li*li;
				long B5 = lj*lj*lj*lj*lj;
				long B52 = -lj*-lj*-lj*-lj*-lj;
				if(A5-B5 == x){
					System.out.println(i+" "+j);
					break outside;
				}
				if(A5-B52 == x){
					System.out.println(i+" "+(-j));
					break outside;
				}
			}	
		}
	}
}

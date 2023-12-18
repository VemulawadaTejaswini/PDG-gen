import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = 0;
		
		int i=1;		//最小公倍数を求める
		while(i<=B){
			if((long)A*i%B==0) {
				C=(long)A*i;
				break;
			}
			else{
				i++;
			}
		}
 		 System.out.println(C);
	}		
}
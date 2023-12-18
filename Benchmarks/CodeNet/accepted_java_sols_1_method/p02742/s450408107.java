import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		long A = H*W;

    	if(H==1||W==1){
			System.out.println("1");
		}else if(A%2==0){
			long ans = A/2;
			System.out.println(ans);
		}else{
			long ans = A/2+1;
			System.out.println(ans);
		}
    }
}

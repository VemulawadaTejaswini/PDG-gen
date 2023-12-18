import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
                int M = scan.nextInt();
                int[] A = new int[M+1];
                int ans = -1;
                
                int hw = 0;
                
                for(int i=1; i<=M; i++){
                    A[i] = scan.nextInt();
                    hw = hw + A[i];
                }
                
                if(N<hw){
                    System.out.println(ans);
                }
                else{
                    System.out.println(N-hw);
                }
	}
}
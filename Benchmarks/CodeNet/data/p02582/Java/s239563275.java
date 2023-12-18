import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long X = sc.nextInt();
        // スペース区切りの整数の入力
        long K = sc.nextInt();
        long D = sc.nextInt();
 
		long Y;
		long A;
		long YY;
		long AA;
        long Z;
      
		for(long i=1;i<K+1;K++){
        	YY=X+i*D-(K-i)*D;
            AA=Math.abs(YY);
        	Y=X+(i-1)*D-(K-(i-1))*D;
            A=Math.abs(Y);
            
            if(AA<A){
            	Z=AA;
            }
        }      
      
        // 出力
        System.out.println(Z);
    }
}

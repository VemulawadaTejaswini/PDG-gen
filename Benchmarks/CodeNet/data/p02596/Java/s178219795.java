import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();
		int A[];
        A=new int[100];
		double B[];
        B=new double[100];
        B[0]=7;
        for(double i=1.0;i<100.0;i++){
        	B[i]=B[i-1]+7.0*(10.0)^i;
        }
        for(int i=1;i<100;i++){
        	A[i]=(int)B[i];
        }        
        int C[];
        C=new int[100];
        for(int i=1;i<100;i++){
        	C[i]=A[i]%K;
            if (K=0){
            	System.out.println(i);
            } else {
            	System.out.println(-1);
            }
        }               
	}
}

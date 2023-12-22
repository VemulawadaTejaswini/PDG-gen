import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] A = new int[M];
	int sNum = 0;
	for(int i=0;i<M;i++){
	    A[i] = sc.nextInt();
	    sNum += A[i];
	}
	if(N - sNum >= 0) System.out.print(N - sNum);
	else System.out.print(-1);
	
    }			    
}

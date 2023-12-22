import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        long A[]=new long[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        long res = 0;
        long max = 0;
        for(int i=0; i<N; i++){
            if(A[i]<max){
                res = res + max - A[i];
            }else{
                max = A[i];
            }
            
        }
		System.out.println(res);
	}
}
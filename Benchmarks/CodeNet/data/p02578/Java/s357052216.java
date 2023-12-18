import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int A[]=new int[N];
        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        int res = 0;
        int max = 0;
        for(int i=0; i<N; i++){
            if(A[i]<max){
                res += max-A[i];
            }else{
                max = A[i];
            }
            
        }
		System.out.println(res);
	}
}
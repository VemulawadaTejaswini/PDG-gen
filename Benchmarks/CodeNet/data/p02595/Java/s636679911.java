import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        long D = sc.nextLong();
        long[] X = new long[N];
        long[] Y = new long[N];
        for(int i=0; i<N; i++){
            X[i] = sc.nextLong();
            Y[i] = sc.nextLong();
        }
        int res=0;
        for(int j=0; j<N; j++){
            if(Math.pow(X[j],2)+Math.pow(Y[j],2)<=Math.pow(D,2)){
                res++;
            }
        }
		System.out.println(res);
	}
}
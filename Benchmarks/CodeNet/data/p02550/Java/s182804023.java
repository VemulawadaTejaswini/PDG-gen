import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long X = sc.nextLong();
        long M = sc.nextLong();
        //long N = sc.nextLong();

        long res=X;
        long A=X;

        boolean[] ch=new boolean[(int)M];
        long[] rui = new long[(int)M];
        int[] ban = new int[(int)M];
        
        rui[1] = X;
        ban[(int)X] = 1;
        ch[(int)X]=true;

        for(int i=2; i<=N; i++){
            A = (long)Math.pow(A, 2)%M;
            ban[(int)A]=i;
            rui[i] = rui[i-1] + A;
            if(ch[(int)A]){
                long junkann = rui[i-1] - rui[ban[(int)A-1]];
                long junkannkazu = (N-i+1)/(i-ban[(int)A]);
                long junkannMod = (N-i+1)%junkannkazu;
                res = rui[i-1] + junkann*junkannkazu + rui[(int)(i-1-i+ban[(int)A]+junkannMod)] - rui[ban[(int)A-1]];
                System.out.println(res);
                return;
            }
            
        }
        
        System.out.println(rui[(int)N]);
        }
    }
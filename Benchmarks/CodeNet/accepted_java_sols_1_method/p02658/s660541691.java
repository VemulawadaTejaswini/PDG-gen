import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        long[] A = new long[N];
        long Sum = 1;
        int hantei = 1;
        boolean hnt = true;
        long S = (long)Math.pow(10,18);
        
        for(int i=0; i<N; i++){
            A[i] = scanner.nextLong();
            if(A[i]==0){
                hantei = 0;
            }
        }
        
        for(int i=0; i<N; i++){
            if(A[i]<=S/Sum){
                Sum *= A[i];
            }else{
                hnt = false;
                break;
            }
        }
        
        
        if(hantei==0){
            System.out.println(0);
        }else if(hnt){
            System.out.println(Sum);
        }else{
            System.out.println(-1);
        }

    }
}

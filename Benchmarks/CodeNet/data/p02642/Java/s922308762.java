import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int loop=0; loop<N; loop++) {
            A[loop] = scanner.nextInt();
        }

        int count=0;

        for(int loop=0; loop<N; loop++) {
            for(int innerLoop=0; innerLoop<N; innerLoop++) {
                if(innerLoop==loop){
                    continue;
                }
                if(A[loop]%A[innerLoop]==0) {
                    count++;
                    break;
                }
            }
        }

        System.out.println( N - count );
    }
}
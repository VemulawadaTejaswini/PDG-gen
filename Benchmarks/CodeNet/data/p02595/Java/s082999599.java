import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        for(int i=0; i<N; i++){
            X[i] = scan.nextInt();
            Y[i] = scan.nextInt();
        }
        scan.close();

        int count=0;
        for(int i=0; i<N; i++){
            if(Math.sqrt(X[i]*X[i] + Y[i]*Y[i]) <= D){
                count++;
            }
        }

        System.out.println(count);
    }
}
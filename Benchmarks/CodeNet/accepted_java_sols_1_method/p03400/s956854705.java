import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<D; j++){
                if(j*A[i]+1<=D){
                    sum += 1;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(sum + X);
    } 
}
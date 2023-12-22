import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        int N=0;
        N = sc.nextInt();
        int[] A;
        A = new int[N];
        int i=0;
        for(i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int j;
        int k;
        int z;
        int swap = 0;
        for(j=0;j<N-1;j++){
            for(k=0;k<N-1;k++){
                if(A[k]>A[k+1]){
                    z = A[k];
                    A[k] = A[k+1];
                    A[k+1] = z;
                    swap++;
                }
            }
        }

        for(i=0;i<N-1;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(A[N-1]);
        System.out.println(swap);   
        sc.close();
    }
}

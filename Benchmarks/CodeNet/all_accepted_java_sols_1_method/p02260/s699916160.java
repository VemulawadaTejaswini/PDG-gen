import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        int N=0;
        N = sc.nextInt();
        int[] A;
        A = new int[N];
        int count=0;
        for(count=0;count<N;count++){
            A[count] = sc.nextInt();
        }
        
        int i;
        int j;
        int minj;
        int z=0;
        int swap=0;
        for(i=0;i<N;i++){
            minj = i;
            for(j=i;j<N;j++){
                if(A[j] < A[minj]){
                    minj = j;
                }
            }
            if(i != minj){
                z = A[i];
                A[i] = A[minj];
                A[minj] = z;
                swap++;
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

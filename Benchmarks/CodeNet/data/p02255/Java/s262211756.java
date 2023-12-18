import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++){
            if(i != N-1){
                System.out.print(A[i]+" ");
            }else{
                System.out.println(A[i]);
            }
        }
        for(int i = 1; i < N; i++){
            int v = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] >v){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            for(int k = 0; k < N; k++){
                if(k != N-1){
                    System.out.print(A[k]+" ");
                }else{
                    System.out.println(A[k]);
                }
            }
        }
    }
}

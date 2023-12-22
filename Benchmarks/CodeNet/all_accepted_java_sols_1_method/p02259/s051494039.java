import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp;
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int change = 0;
        for(int i=N;i>=1;i--){
            for(int j=0;j<i-1;j++){
                if(A[j] > A[j+1]){
                    tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                    change++;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(A[i]);
            if(i<N-1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(change);
    }
}

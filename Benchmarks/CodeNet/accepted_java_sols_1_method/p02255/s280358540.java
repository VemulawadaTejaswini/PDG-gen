import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i]=scan.nextInt();
        }
        int v;
        int j;
        for(int i=1;i<N;i++){
            for(int k=0;k<N-1;k++){
                System.out.print(A[k]+" ");
            }
            System.out.println(A[N-1]);
            v = A[i];
            j = i-1;
            for(; A[j]>v;){
                A[j+1]=A[j];
                j--;
                if(j<0) break;
            }
            A[j+1]=v;
        }
        for(int k=0;k<N-1;k++){
            System.out.print(A[k]+" ");
        }
        System.out.println(A[N-1]);
    }
}

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] A = new int[2][N];

        for(int i=0; i<2; i++){
            for(int j=0; j<N; j++){
                A[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        int max = 0;
        int x = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sum += A[x][j];
                if(j==i && x==0){
                    x += 1;
                    j -= 1;
                }
            }
            max = Math.max(max, sum);
            sum = 0;
            x = 0;
        }
        System.out.println(max);
    }
}
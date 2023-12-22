import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [][] ab = new int[2][N];
        for(int i=0; i<2;i++){
            for(int j=0; j<N;j++){
                ab[i][j] = in.nextInt();
            }
        }
        int [] dif = new int[N];
        int index =0;
        for(int i =1; i<=N;i++){
            for(int j=0; j<=N-i;j++){
                dif[index]+=ab[0][j];
            }
            for(int j=N-1;j>=N-i;j--){
                dif[index]+=ab[1][j];
            }
            index++;
        }
        int max = dif[0];
        for(int i: dif){
            if(i>max){
                max = i;
            }
        }
        System.out.println(max);
    }
}

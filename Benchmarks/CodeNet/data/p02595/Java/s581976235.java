import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Double D = sc.nextDouble();
        int[][] X = new int[N][2];

        for(int i=0; i<N*2; i++){
            if(i%2 == 0){
                X[i/2][0] = sc.nextInt();
            }else{
                X[i/2][1] = sc.nextInt();
            }
        }
        sc.close();
        int ans = 0;
        for(int i=0; i<N; i++){
            if(Math.sqrt((X[i][0]*X[i][0]+X[i][1]*X[i][1])) < D){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}

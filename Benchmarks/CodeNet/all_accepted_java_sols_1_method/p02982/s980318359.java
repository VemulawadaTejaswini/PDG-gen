import java.util.*;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[][] X = new int[N][D];

        for(int i = 0;i<N;i++){
            for(int j=0;j<D;j++){
                X[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i=0;i<N;i++){
            for(int j= i+1;j<N;j++){
                double powDistance =0;
                for(int k=0;k<D;k++){
                    powDistance += Math.pow((X[i][k] - X[j][k]),2);
                }
                double distance = Math.sqrt(powDistance);

                if(distance == Math.ceil(distance)){
                    ans++;
                }

            }
        }
        System.out.println(ans);



    }



}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[][] cs = new int[N][D];


        int count =0;

        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < D; j++) {
                cs[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N ; i++) {
            for (int j = i+1; j < N; j++) {
                int sum = 0;
                for (int k = 0; k < D; k++) {
                    sum += (cs[i][k]-cs[j][k])*(cs[i][k]-cs[j][k]);
                }
                double dist =Math.sqrt(sum);
                if( (dist - Math.floor(dist))==0){
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}

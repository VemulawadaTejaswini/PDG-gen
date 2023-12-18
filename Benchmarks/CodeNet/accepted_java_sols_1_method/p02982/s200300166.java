import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int point[][] = new int[n][d];

        for (int i=0; i<n; i++){
            for(int j=0; j<d; j++){
                point[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                double distance = 0;
                for (int k=0; k<d; k++){
                    distance += Math.pow((point[i][k]-point[j][k]), 2);
                }
                int a = (int)Math.sqrt(distance);
                if (a*a == distance){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}

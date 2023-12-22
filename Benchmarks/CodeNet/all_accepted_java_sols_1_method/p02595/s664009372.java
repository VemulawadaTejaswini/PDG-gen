import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pardonDist = sc.nextDouble();
        int[][] coordinate = new int[n][2];
        for(int i=0; i<n; i++) for(int j=0; j<2; j++) coordinate[i][j] = sc.nextInt();
        int count = 0;
        double dist = 0;
        for(int i=0; i<n; i++) {
            dist = Math.sqrt(Math.pow(coordinate[i][0], 2) + Math.pow(coordinate[i][1], 2));
            if(dist <= pardonDist) count++;
        }

        System.out.println(count);
    }
}



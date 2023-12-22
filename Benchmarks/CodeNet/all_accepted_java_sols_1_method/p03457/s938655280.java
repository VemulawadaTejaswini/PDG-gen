import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        final int NUM = scan.nextInt();
        int[][] points = new int[NUM+1][3];
        points[0] = new int[]{0, 0, 0};
        for(int i = 1; i <= NUM; i++){
            points[i][0] = scan.nextInt();
            points[i][1] = scan.nextInt();
            points[i][2] = scan.nextInt();
        }

        // sort
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        // search
        String answer = "Yes";
        for(int i = 1; i <= NUM; i++){
            int grace = points[i][0] - points[i - 1][0];
            int distance = Math.abs(points[i][1] - points[i-1][1]) + Math.abs(points[i][2] - points[i-1][2]);
            if(grace >= distance ){
                if((grace % 2 == 0 && distance % 2 == 0) || (grace % 2 == 1 && distance % 2 == 1) ){
                    
                } else {
                    answer = "No";
                    break;
                }
            } else {
                answer = "No";
                break;
            }
        }

        // answer
        System.out.println(answer);

    }
}
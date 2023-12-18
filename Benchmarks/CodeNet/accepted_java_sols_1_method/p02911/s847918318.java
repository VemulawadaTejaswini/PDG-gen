import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int points[] = new int[sc.nextInt()];
        int startPoint = sc.nextInt();
        int correctNum = sc.nextInt();

        Arrays.fill(points, startPoint);

        for(int i = 0; i < correctNum; i++){
            int answer = sc.nextInt() - 1 ;
                points[answer] += 1;
        }

        for(int i = 0;  i< points.length; i++){
            if(points[i] - correctNum > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}

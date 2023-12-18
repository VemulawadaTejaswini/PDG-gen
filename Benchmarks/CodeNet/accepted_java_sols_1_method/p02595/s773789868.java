import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i  = 0; i < n; i++){
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++){
            double temp = Math.sqrt(Math.pow(array[i][0],2) + Math.pow(array[i][1], 2));
            if (temp <= d){
                result ++;
            }
        }
        System.out.println(result);

    }
}

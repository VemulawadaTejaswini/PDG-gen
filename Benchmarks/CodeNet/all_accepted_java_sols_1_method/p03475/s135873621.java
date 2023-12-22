import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n-1][3];
        for(int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        int time = 0;
        for(int i = 0; i < arr.length; i++) {
            time = 0;
            for(int j = i; j < arr.length; j++) {
                if(time < arr[j][1]) time = arr[j][1];
                else if(time % arr[j][2] != 0) {
                    time += arr[j][2] - time % arr[j][2];
                } 
                time += arr[j][0];
            }
            System.out.println(time);
        }
        System.out.println(0);
    }
}

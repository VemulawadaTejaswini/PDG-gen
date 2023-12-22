import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int timeLimit = sc.nextInt();
        int[][] input = new int[N][2];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2; j++){
                input[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++) {
            if (input[i][1] <= timeLimit) {
                list.add(i);
            }
        }
        if (list.size() == 0){
            System.out.println("TLE");
        }else {
            int min = input[0][0];
            for (int k : list) {
                if (input[k][0] < min) {
                    min = input[k][0];
                }
            }

            System.out.println(min);
        }
    }
}
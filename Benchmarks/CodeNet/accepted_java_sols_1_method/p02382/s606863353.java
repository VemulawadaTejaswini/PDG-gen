import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] list = new int[3][n];

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < n; col++){
                list[row][col] = scanner.nextInt();
            }
        }

        for(int col = 0; col < n; col++){
            list[2][col] = Math.abs(list[0][col] - list[1][col]);
        }

        // p = 1
        double sum = 0;
        for(int num : list[2]){
            sum += num;
        }
        System.out.println(sum);

        // p = 2
        sum = 0;
        for(int num : list[2]){
            sum += Math.pow(num, 2);
        }
        System.out.println(Math.sqrt(sum));

        // p = 3
        sum = 0;
        for(int num : list[2]){
            sum += Math.pow(num, 3);
        }
        System.out.println(Math.pow(sum, 1.0/3.0));

        // p = inf
        sum = list[2][0];
        for(int num : list[2]){
            sum = num > sum ? num : sum;
        }
        System.out.println(sum);

        scanner.close();
    }
}


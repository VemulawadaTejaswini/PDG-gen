import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[h][w];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            switch (a){
                case 1:
                    for (int j = 0; j <= x - 1; j++) {
                        for (int k = 0; k < h; k++) {
                            matrix[k][j] = 1;
                        }
                    }
                    break;
                case 2:
                    for(int j = x; j < w; j++){
                        for (int k = 0; k < h; k++) {
                            matrix[k][j] = 1;
                        }
                    }
                    break;
                case 3:
                    for (int j = 0; j < w; j++) {
                        for (int k = 0; k <= y - 1; k++) {
                            matrix[k][j] = 1;
                        }
                    }
                    break;
                case 4:
                    for (int j = 0; j < w; j++) {
                        for (int k = y; k < h; k++) {
                            matrix[k][j] = 1;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        int area = 0;
        for (int j = 0; j < h; j++) {
            for (int k = 0; k < w; k++) {
                if(matrix[j][k] == 0)
                    area += 1;
            }
        }
        System.out.println(area);
    }
}

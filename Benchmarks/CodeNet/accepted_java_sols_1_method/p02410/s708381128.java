import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int array[][] = new int[n][m];

        int mj[] = new int[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            mj[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += mj[j] * array[i][j];
            }
            System.out.println(sum);
        }
    }
}

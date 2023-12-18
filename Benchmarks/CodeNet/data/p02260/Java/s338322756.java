import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        int x[];
        x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = num.nextInt();
        }
        int count = 0;

        for(int i = 0; i <= n-1; i++){
            int minj = i;
            for(int j = i; j <= n-1; j++){
                if(x[j] < x[minj]){
                    minj = j;
                }
            }
            if(x[i] != x[minj]){
                int tmp = x[i];
                x[i] = x[minj];
                x[minj] = tmp;
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d", x[i]);
            if (i != n - 1) System.out.printf(" ");
            else System.out.printf("\n");
        }

        System.out.println(count);
    }
}

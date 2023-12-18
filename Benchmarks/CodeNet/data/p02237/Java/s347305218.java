import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    int m[][] = new int[n][n];

    for(int i = 0;i < n;i++){
        for(int j = 0;j < n;j++){
            m[i][j] = 0;
        }
    }

    for(int i = 0;i < n;i++){
        int u = input.nextInt();
        int k = input.nextInt();
        for(int j = 0;j < k;j++){
            int l = input.nextInt();
            m[u - 1][l - 1] = 1;
        }
    }

    for(int i = 0;i < n;i++){
        for(int j = 0;j < n;j++){
            System.out.print(m[i][j]);
            if(j < n - 1)
                System.out.print(" ");
        }
        System.out.println("");
    }
  }
}
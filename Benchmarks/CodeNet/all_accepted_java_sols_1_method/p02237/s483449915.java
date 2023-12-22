import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++)
                data[i][j] = 0;
        }
        for(int i = 0 ; i < n ; i++){
            int nul = sc.nextInt();
            int k = sc.nextInt();
            for(int v = 0 ; v < k ; v++)
                data[i][sc.nextInt()-1]++;
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-1 ; j++)
                System.out.print(data[i][j] + " ");
            System.out.println(data[i][n-1]);
        }
    }
}

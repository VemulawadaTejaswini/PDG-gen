import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;// = new Scanner(System.in);
        sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a[][] = new int[x][y];
        int b[] = new int[y];
        for(int i=0;i<x;i++){
            sc.nextLine();
            for(int j=0;j<y;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<y;i++){
            sc.nextLine();
            b[i] = sc.nextInt();
        }

        for(int i=0;i<x;i++){
            int n = 0;
            for(int j=0;j<y;j++){
                n += a[i][j]*b[j];
            }
            System.out.println(n);
        }
    }
}

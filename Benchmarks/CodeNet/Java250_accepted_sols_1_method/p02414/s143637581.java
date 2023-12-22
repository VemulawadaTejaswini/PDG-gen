import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;// = new Scanner(System.in);
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int A[][] = new int[n][m];
        int B[][] = new int[m][l];
        long C[][] = new long[n][l];
        for(int x = 0;x<n;x++){
            sc.nextLine();
            for(int y = 0;y<m;y++){
                A[x][y] = sc.nextInt();
            }
        }

        for(int x = 0;x<m;x++){
            sc.nextLine();
            for(int y = 0;y<l;y++){
                B[x][y] = sc.nextInt();
            }
        }

        for(int x = 0;x<n;x++){
            for(int y = 0;y<l;y++){
                C[x][y] = 0;
                for(int z = 0;z<m;z++){
                    C[x][y] += A[x][z]*B[z][y];
                }
                if(y == 0){
                    System.out.print(C[x][y]);
                }else{
                    System.out.print(" "+C[x][y]);
                }
            }
            System.out.println();
        }
    }
}

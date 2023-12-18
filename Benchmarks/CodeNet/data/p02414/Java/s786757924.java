import java.util.Scanner;
class Main{
    int n,m,l;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        l = sc.nextInt();
        int [][] a = new int [n+1][m+1];
        int [][] b = new int [m+1][l+1];
        for(int x = 0; x < n; x++){
            for(int y = 0; y < m; y++){
                a[x][y] = sc.nextInt();
            }
        }
        for(int x = 0; x < m; x++){
            for(int y = 0; y < l; y++){
                b[x][y] = sc.nextInt();
            }
        }
        for(int x = 0; x < n; x++){
            for(int y = 0; y < l; y++){
                System.out.printf("%d ",a[x][y]*b[y][x]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
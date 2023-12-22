import java.util.Scanner;
class Main{
    int r,c,x,y;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        int [][] a = new int [r+1][c+1];
        for(x = r; x < r+1; x++){
            for(y = c; y < c+1; y++){
                a[x][y] = 0;
            }
        }
        for(x = 0; x < r; x++){
            for(y = 0; y < c; y++){
                a[x][y] = sc.nextInt();
                a[x][c] += a[x][y];
                a[r][y] += a[x][y];
                a[r][c] += a[x][y];
            }
        }
        for(x = 0; x < r+1; x++){
            for(y = 0; y < c; y++){
                System.out.printf("%d ",a[x][y]);
            }
            System.out.printf("%d",a[x][y]);
            System.out.println();
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
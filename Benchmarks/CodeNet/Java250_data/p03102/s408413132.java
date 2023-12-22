import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        //入力
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int c=scn.nextInt();
        int[] b=new int[m];
        int[][] a=new int[n][m];
        for(int i=0;i<m;i++){
            b[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scn.nextInt();
            }
        }
        //処理
        int cnt=0;
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total+=a[i][j]*b[j];
            }
            if(total+c>0) cnt++;
            total=0;
        }
        //出力
        System.out.println(cnt);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String[] nm=str.split(" ");
         
        int n=Integer.parseInt(nm[0]);
        int m=Integer.parseInt(nm[1]);
        int[][] a=new int [n+1][m+1];
         
        for(int i=1;i<=n;i++){
            str=br.readLine();
            String[] div=str.split(" ");
            for(int j=1;j<=m;j++){
                a[i][j]=Integer.parseInt(div[j-1]);
            }
        }
        int [] b=new int [m+1];
         
        for(int i=1;i<=m;i++){
            str=br.readLine();
            b[i]=Integer.parseInt(str);
        }
         
        int c[]=new int[n+1];
        Arrays.fill(c,0); //c[]に初期値0を設定     
      
        //行列Cを算出
        for(int j=1;j<=n;j++){
            for(int i=1;i<=m;i++){
                c[j]+=a[j][i]*b[i];
            }
            System.out.println(c[j]);
        }
    }
}
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        int N = Integer.parseInt(reader.readLine());
        long res = 0;
        int[][] a = new int[10][10];
        for(int i=1;i<=N;i++){
            String s = Integer.toString(i);
            a[Character.getNumericValue(s.charAt(0))][i%10]+=1;
        }
        for(int u=0;u<10;u++){
            res+=a[u][u]*a[u][u];
            for(int i=u+1;i<10;i++){
                res+=2*a[u][i]*a[i][u];
            }
        }
        System.out.println(res);
    }
}
import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,j,tmp;
        int[][] A = new int[101][101];
        int[] n = new int[990];
        String s;
        String[] str = new String[990];
        StringBuilder out = new StringBuilder();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        str = in.readLine().split(" ");
        for(i=0;i<2;i++){
            n[i]=Integer.parseInt(str[i]);   
        } 
        for(i=0;i<n[0];i++){
            s = in.readLine();
            str = s.split(" ");
            for(j=0;j<n[1];j++){
                tmp = Integer.parseInt(str[j]);
                A[n[0]][j]+=tmp; A[i][n[1]]+=tmp; A[n[0]][n[1]]+=tmp;
            }
            out.append(s+" "+A[i][n[1]]+"\n");
        }
        for(i=0;i<=n[1];i++){
            if(i!=0) out.append(" ");
            out.append(A[n[0]][i]);
        }    
        System.out.println(out);     
        System.out.flush();
    }
}
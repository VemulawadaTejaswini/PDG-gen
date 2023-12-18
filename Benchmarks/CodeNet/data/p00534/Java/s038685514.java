import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{

static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st=new StringTokenizer(line);
int n=Integer.parseInt(st.nextToken());
int m=Integer.parseInt(st.nextToken());
int[][] tir=new int[m+1][n+1];
Arrays.fill(tir[m],INF);
tir[m][n]=0;
int[] d=new int[n];
int[] c=new int[m];
for(int i=0;i<n;i++) d[i]=Integer.parseInt(br.readLine());
for(int i=0;i<m;i++) c[i]=Integer.parseInt(br.readLine());
for(int i=m-1;i>=0;i--){
for(int j=n-1;j>=0;j--){
tir[i][j]=Math.min(tir[i+1][j],tir[i+1][j+1]+d[j]*c[i]);
}
}
out.println(tir[0][0]);
out.flush();
}
}
}
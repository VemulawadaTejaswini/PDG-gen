import java.io.*;
import java.util.StringTokenizer;

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
int[][] tir=new int[m][n+1];
Arrays.fill(tir[m-1],INF);
tir[m-1][n]=0
int[] d=new int[n];
int[] c=new int[m];
for(int i=0;i<n;i++) d[i]=Integer.parseInt(br.readLine());
for(int i=0;i<m;i++) c[i]=Integer.parseInt(br.readLine());
for(int i=n-1;i>=0;i--){
for(int j=m-2;j>=0;j--){
tir[j][i]=Math.min(tir[j][i+1],tir[j+1][i+1]+d[j]*c[i]);
}
}
out.println(tir[0][0]);
out.flush();
}
}
}
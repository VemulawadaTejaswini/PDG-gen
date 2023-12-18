import java.io.*;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st=new StringTokenizer(line);
int n=Integer.parseInt(st.nextToken());
int m=Integer.parseInt(st.nextToken());
int[][] tir=new int[n+1][m];
int[] d=new int[n];
int[] c=new int[m];
for(int i=0;i<n;i++) d[i]=Integer.parseInt(br.readLine());
for(int i=0;i<m;i++) c[i]=Integer.parseInt(br.readLine());
for(int i=0;i<=n;i++){
for(int j=0;i<m;j++){
tir[i][j]=Math.min(tir[i][j+1],tir[i+1][j+1]+d[i]*c[j]);
}
}
out.println(tir[0][0]);
out.flush();
}
}
}
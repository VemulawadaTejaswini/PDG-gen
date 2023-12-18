import java.io.*;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while(line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
int[] r=new int[n];
for(int i=0;i<n;i++) r[i]=Integer.parseInt(br.readLine());
int ans=Integer.MIN_VALUE;
for(int i=1;i<n;i++){
for(int j=0;j<n&&i>j;j++){
ans=Math.max(ans,r[i]-r[j]);
}
}
out.println(ans);
out.flush();
}
}
}
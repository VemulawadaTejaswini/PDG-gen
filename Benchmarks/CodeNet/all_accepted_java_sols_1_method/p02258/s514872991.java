import java.io.*;
  
class Main{
  
static final PrintWriter out=new PrintWriter(System.out);
  
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
int[] r=new int[n];
for(int i=0;i<n;i++) r[i]=Integer.parseInt(br.readLine());
int ans=Integer.MIN_VALUE;
int min=r[0];
for(int i=1;i<n;i++){
ans=Math.max(ans,r[i]-min);
min=Math.min(min,r[i]);
}
out.println(ans);
out.flush();
}
}
}
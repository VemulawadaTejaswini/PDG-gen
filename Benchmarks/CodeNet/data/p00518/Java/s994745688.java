import java.io.*;
import java.util.Arrays;
    
class Main{
   
static final PrintWriter out=new PrintWriter(System.out);
static final int MOD=10007;
    
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
int[] pic=new int[n];
line=br.readLine();
for(int i=0;i<n;i++) pic[i]=bit(line.charAt(i));
int[][] dp=new int[n][1<<3];
for(int i=0;i<1<<3;i++){
if((i&(1<<0))!=0&&(i&pic[0])!=0) dp[0][i]=1;
}
for(int i=1;i<n;i++)
for(int j=1;j<(1<<3);j++)
for(int k=1;k<(1<<3);k++)
if((k&pic[i])!=0){
if((j&pic[i])!=0) dp[i][k]+=dp[i-1][j];
else if((j&k)!=0) dp[i][k]+=dp[i-1][j];
dp[i][k]%=MOD;
}
int ans=0;
for(int i=1;i<1<<3;i++) ans+=dp[n-1][i];
out.println(ans%MOD);
out.flush();
}
}
  
public static int bit(char c){
if(c=='J') return 1<<0;
else if(c=='O') return 1<<1;
else return 1<<2;
}
}
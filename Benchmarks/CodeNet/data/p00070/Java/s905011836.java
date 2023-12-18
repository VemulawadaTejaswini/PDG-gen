import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int[][] dp=new int[11][331];
boolean[] use=new boolean[10];
dfs(1,0,dp,use);
while((line=br.readLine())!=null){
String[] values=line.split(" ");
int n=Integer.parseInt(values[0]);
int s=Integer.parseInt(values[1]);
if(n>10||s>330){
System.out.println("0");
continue;
}
System.out.println(dp[n][s]);
}
}
private static void dfs(int depth,int sum,int[][] dp,boolean[] use){
dp[depth-1][sum]++;
for(int i=0;i<=9;i++){
if(!use[i]){
use[i]=true;
dfs(depth+1,sum+depth*i,dp,use);
use[i]=false;
}
}
}
}
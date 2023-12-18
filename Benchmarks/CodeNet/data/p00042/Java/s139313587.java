import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int count=1;
while(!(line=br.readLine()).equals("0")){
int weight=0;
static int W=Integer.parseInt(line);
static int n=Integer.parseInt(br.readLine());
static int[] v=new int[n];
static int[] w=new int[n];
static int[][] dp=new int[n+1][W+1];
static boolean[] use=new boolean[n];
for(int i=0;i<n;i++){
String[] str=br.readLine().split(",");
v[i]=Integer.parseInt(str[0]);
w[i]=Integer.parseInt(str[1]);
}
System.out.println("Case "+count+":");
System.out.println(MaxValue(0,W));
for(int i=0;i<n;i++){
if(use[i]){
weight+=w[i];
}
System.out.println(weigght);
}
}
private static int MaxValue(int i,int j){
if(dp[i][j]!=0){
return dp[i][j];
}
else if(i==n){
return 0;
}
else if(j>w[i]){
use[i]=false;
return dp[i][j]=MaxValue(i+1,j);
}
else{
int p=MaxValue(i+1,j);
int q=MaxValue(i+1,j-w[i])+v[i];
int r=Math.max(MaxValue(i+1,j),MaxValue(i+1,j-w[i])+v[i]);
use[i]=(p==r)?false:true;
return dp[i][j]=r;
}
}
}
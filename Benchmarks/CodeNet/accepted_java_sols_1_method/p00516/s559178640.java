import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st=new StringTokenizer(line);
int n=Integer.parseInt(st.nextToken());
int m=Integer.parseInt(st.nextToken());
int[] cost=new int[n];
int[] vote1=new int[n];
for(int i=0;i<n;i++) cost[i]=Integer.parseInt(br.readLine());
for(int i=0;i<m;i++){
int judge=Integer.parseInt(br.readLine());
for(int j=0;j<n;j++){
if(cost[j]>judge) continue;
vote1[j]++;
break;
}
}
int[] vote2=vote1.clone();
Arrays.sort(vote2);
int max=vote2[n-1];
for(int i=0;i<n;i++){
if(vote1[i]==max){
out.println(i+1);
break;
}
}
out.flush();
}
}
}
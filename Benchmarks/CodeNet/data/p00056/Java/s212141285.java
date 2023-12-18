import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int count;
boolean p=new boolean[50001];
for(int i=0;i<=50000;i++){
p[i]=true;
}
p[0]=false;
p[1]=false;
for(int i=2;i<=Math.sqrt(50000)+1;i++){
if(p[i]){
for(int j=i+i;j<=50000;j+=i){
p[j]=false;
}
}
}
while(!(line=br.readLine()).equals("0")){
count=0;
int n=Integer.parseInt(line);
for(int i=2;i<=n/2;i++){
if(p[i]&&p[n-i]){
count++;
}
}
System.out.println(count);
}
}
}
import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int[] A=new Int[101];
int a=0;
while(true){
String x=br.readLine();
String y=br.readLine();
int n=Integer.parseInt(x);
int m=Integer.parseInt(y);
if(x==0&&y==0)
break;
int sum=0;
for(int i=1;i<=x;i++){
for(int j=i;j<=x;j++){
for(int k=j;k<=x;k++){
if(i+j+k==m)
sum++;
}
}
}
A[a]=sum;
a++;
}
for(int z=0;z<a;z++)
System.out.println(A[z]);
}
}
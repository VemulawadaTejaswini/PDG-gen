import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
boolean[] flag=new boolean[10];
while((str=br.readLine())!=null){
int n=Integer.parseInt(str);
int t=9;
while(t>=0){
int p=(int)Math.pow(2,t);
n=(n>=p)?n-p:n;
flag[t]=(n>=p)?true:false;
t--;
}
}
for(int i=0;i<10;i++){
if(flag[i]){
System.out.print(Math.pow(2,i));
if(i==9){
System.out.println("");
}
else{
System.out.print(" ");
}
}
}
}
}
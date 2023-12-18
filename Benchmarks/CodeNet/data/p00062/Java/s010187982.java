import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int num[]=new int[10];
while((line=br.readLine())!=null){
for(int i=0;i<10;i++){
num[i]=(int)(line.charAt(i)-'0');
}
for(int i=8;i>=0;i--){
for(int j=0;j<=i;j++){
num[j]=(num[j]+num[j+1])%10;
}
}
System.out.print(num[0]);
}
}
}
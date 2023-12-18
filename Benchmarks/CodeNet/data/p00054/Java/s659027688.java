import java.io.*;
import java.math.BigDecimal;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
String[] values=line.split(" ");
int a=Integer.parseInt(values[0]);
int b=Integer.parseInt(values[1]);
int n=Integer.parseInt(values[2]);
int sum=0;
for(int i=0;i<n;i++){
a*=10;
sum+=(a/b)%10;
}
}
}
}
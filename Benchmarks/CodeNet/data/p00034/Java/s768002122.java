import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
int[] l=new int[11];
l[0]=0;
while((line=br.readLine())!=null){
String[] value=line.split(",");
for(int i=0;i<10;i++){
l[i+1]=l[i]+Integer.parseInt(value[i]);
}
int v1=Ineger.parseInt(value[10]);
int v2=Integer.parseInt(value[11]);
double d=l[10]*v1/(v1+v2);
for(int i=0;i<10;i++){
if(l[i+1]>=d){
System.out.println(i+1);
break;
}
}
}
}
}
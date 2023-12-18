import java.io.*;

class Main{
public static void main(String[] args){
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
int count[]=new int[101];
int max=0;
while((line=br.nextLine())!=null){
count[Integer.parseInt(line)]++;
}
for(int i=1;i<=100;i++){
max=Math.max(max,count[i]);
}
for(int i=0;i<=100;i++){
if(count[i]==max){
System.out.println(i);
}
}
}
}
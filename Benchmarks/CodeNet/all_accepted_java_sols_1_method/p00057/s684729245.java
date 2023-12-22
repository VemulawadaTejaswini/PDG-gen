import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int count;
while((line=br.readLine())!=null){
count=1;
int n=Integer.parseInt(line);
for(int i=1;i<=n;i++){
count+=i;
}
System.out.println(count);
}
}
}
import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int sum=0;
int amount=0;
int p=0;
int q=0;
int count=0;
while((line=br.readLine())!=null){
String[] values=line.split(",");
p=Integer.parseInt(values[0]);
q=Integer.parseInt(values[1]);
sum+=p*q;
amount+=q;
count++;
}
System.out.println(sum);
System.out.println(Math.round((float)amount/count));
}
}
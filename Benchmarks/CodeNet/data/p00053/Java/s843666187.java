import java.io.*;
import java.math.BigInteger;
 
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int[] ps=new int[20000];
ps[1]=2
BigInteger x=BigInteger.valueOf(ps[1]);
for(int i=2;i<20000;i++){
x=x.nextProbablePrime();
ps[i]+=x.intValue();
}
while(!(line=br.readLine()).equals("0")){
System.out.println(ps[Integer.parseInt(line)]);
}
}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
int a=Integer.parseInt(line);
BigInteger x=BigInteger.valueOf(a);
System.out.println(prevProbablePrime(a)+" "+x.nextProbablePrime());
}
}
public static int prevProbablePrime(int a){
a--;
while(true){
BigInteger y=BigInteger.valueOf(a);
if(y.isProbablePrime(2)){
return a;
}
a--;
}
}
}
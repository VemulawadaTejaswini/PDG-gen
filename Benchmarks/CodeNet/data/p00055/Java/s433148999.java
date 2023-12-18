import java.io.*;
import java.math.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
double n=Double.parseDouble(line);
for(int i=0;i<4;i++){
n=n*2/3;
}
n*=2;
BigDecimal x=BigDecimal.valueOf(n);
x=x.setScale(8,BigDecimal.ROUND_HALF_UP);
System.out.println(x);
}
}
}
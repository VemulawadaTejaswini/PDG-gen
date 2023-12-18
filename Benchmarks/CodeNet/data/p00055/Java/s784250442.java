import java.io.*;
import java.math.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
BigDecimal n=new BigDecimal(line);
for(int i=0;i<4;i++){
n=n.multiply(BigDecimal.valueOf(2)).divide(BigDecimal.valueOf(3));
}
n=n.multiply(BigDecimal.valueOf(2));
n=n.setScale(8,BigDecimal.ROUND_HALF_UP);
System.out.println(n.doubleValue());
}
}
}
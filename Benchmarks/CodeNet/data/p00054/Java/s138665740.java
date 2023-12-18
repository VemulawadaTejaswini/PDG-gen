import java.io.*;
import java.math.BigDecimal;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
String[] values=line.split(" ");
BigDecimal a=BigDecimal.valueOf(Integer.parseInt(values[0]));
BigDecimal b=BigDecimal.valueOf(Integer.parseInt(values[1]));
int n=Integer.parseInt(values[2]);
while(true){
if(a.intValue()>=b.intValue()){
a=a.subtract(b);
continue;
}
break;
}
BigDecimal c=a.divide(b);
int sum=0;
c=c.multiply(BigDecimal.valueOf(Math.pow(10,n)));
c=c.setScale(0,BigDecimal.ROUND_DOWN);
int d=c.intValue();
String str=String.valueOf(d);
if(str.length()==n{
for(int i=0;i<str.length();i++){
sum+=(int)(str.charAt(i)-'0');
}
}
System.out.println(sum);
}
}
}
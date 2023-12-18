import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int sum1,sum2,sum3;
int a=0;
while(true){
a++;
String x=br.readLine();
String y=br.readLine();
String z=br.readLine();
sum1=Integer.parseInt(x);
sum2=Integer.parseInt(y);
sum3=Integer.parseInt(z);
if(sum1==-1&&sum2==-1&&sum3==-1)
break;
int S;
S=sum1+sum2;
if(sum1==-1||sum2==-1){
if(S>=80)
System.out.println("A");
else if(S>=65)
System.out.println("B");
else if(S>=50)
System.out.println("C");
else if(S>=30&&sum3>=50)
System.out.println("C");
else if(S>=30)
System.out.println("D");
else
System.out.println("F");
}
else
System.out.println("F");

}
}
}
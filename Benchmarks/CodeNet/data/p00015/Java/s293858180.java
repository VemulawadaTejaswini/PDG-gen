import java.util.Scanner;
import java.math.BigInteger;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0i<n;i++){
BigInteger a=sc.nextBigInteger();
BigInteger b=sc.nextBigInteger();
a=a.add(b);
if(a.toString().length()>80{
System.out.println("overflow");
}
else{
System.out.println(a);
}
}
}
}
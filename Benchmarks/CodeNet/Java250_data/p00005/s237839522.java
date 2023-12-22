import java.io.*;
import java.util.*;

class Main{

public static void main(String args[]) throws java.io.IOException{
Scanner scan = new Scanner(System.in);
while(scan.hasNext()){
long a =scan.nextLong();
long b = scan.nextLong();
System.out.println(gcd(a,b)+" "+(a*b)/gcd(a,b));
}


}
public static long gcd(long a,long b){
if(b==0)return a;
return gcd(b,a%b);
}
}
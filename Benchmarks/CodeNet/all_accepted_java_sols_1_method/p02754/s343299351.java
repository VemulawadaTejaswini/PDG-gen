import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
long n=scan.nextLong();
long a=scan.nextLong();
long b=scan.nextLong();
  
if(n%(a+b)==0){
  System.out.println(n/(a+b)*a);
}else{
  long g=n/(a+b);
  long h=Math.min(n%(a+b),a);
System.out.println(g*a+h);
}

}
}
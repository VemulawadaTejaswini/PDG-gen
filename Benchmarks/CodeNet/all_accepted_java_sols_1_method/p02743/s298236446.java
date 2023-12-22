import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
long a=scan.nextLong();
long b=scan.nextLong();
long c=scan.nextLong();

if((4*a*b<(c-a-b)*(c-a-b))&&(c>a+b)){
System.out.println("Yes");
}else{
System.out.println("No");  
}
  
  
}
}

import java.util.*;

class Main{
public static void main(String[] args){
int a;
int b;
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
a=sc.nextInt();
b=sc.nextInt();
int d=(int)Math.log10(a+b)+1;
System.out.println(d);
}
}
}
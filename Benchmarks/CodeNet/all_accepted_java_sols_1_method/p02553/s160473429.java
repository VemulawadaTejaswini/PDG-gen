import java.util.*;
import java.lang.Math;

public class Main{

public static void main(String[] args){
Scanner scanner1 = new Scanner(System.in);
Scanner scanner2 = new Scanner(System.in);
long a=scanner1.nextLong();
long b=scanner1.nextLong();
long c=scanner1.nextLong();
long d=scanner1.nextLong();
long t=a*c;

long e=Math.max(a*c,Math.max(a*d,Math.max(b*c,b*d)));
System.out.println(e);



}
}
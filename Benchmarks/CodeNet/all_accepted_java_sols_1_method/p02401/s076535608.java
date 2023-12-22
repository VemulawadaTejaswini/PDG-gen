import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
int a=Integer.parseInt(sc.next());
String op=sc.next();
int b=Integer.parseInt(sc.next());
if(op.equals("?") ){break; }
if(op.equals("-"))System.out.println(a-b);
if(op.equals("*"))System.out.println(a*b);
if(op.equals("/"))System.out.println(a/b);
if(op.equals("+"))System.out.println(a+b);

}
}
}

import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String a=sc.next();
String b=sc.next();
a+=b;
double i=Double.valueOf(a);
int j=(int)Math.sqrt(i);
if(Math.pow(j,2)==i){System.out.println("Yes");}else{System.out.println("No");}
}}
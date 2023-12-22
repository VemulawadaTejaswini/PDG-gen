import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int k=Integer.parseInt(sc.next());
for(int i=a;i<=b;i++){if(i<a+k||b-k<i)System.out.println(i);}
}}
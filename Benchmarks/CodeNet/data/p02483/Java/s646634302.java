import java.util.Scanner;
 
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d;
if( a < b){
 d = b; b = a; a = d;
}
if( b < c){
 d = c; c = b; b = d;
}
if( a < b){
 d = b; b = a; a = d;
}
System.out.println(a + " " + b + " " + c);
}
}
 
import java.util.Scanner;
 public class Main {
 public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 if(a>b){
 int tenp1=a;
 a=b;
 b=temp1;
 }
 if(b>c){
 int temp2=b;
 b=c; 
 c=temp2;
 }
 if(a>b){
 int temp3=a;
 a=b;
 b=temp3;
 }
 System.out.println(a+" "+b+" "+c);
 }
 }
import java.util.Scanner;
public class Main {
public static void main (String[]args) {
Scanner sc = new Scanner (System.in);

int A = sc.nextInt();
int B = sc.nextInt();

if(A >=0 && A <=100 && B%2==0 && B >=2 && B <=1000) {
if(A >= 13 ) {
System.out.println(B);
}else if(A >=6 && A <= 12) {
System.out.println(B/2);
}else{
System.out.println(0);
}
}
}
}
import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
if(B<0){
if(A-B>A*B){
System.out.println(A-B);
}else{
System.out.println(A*B);
}
}else{
if(A+B>A*B){
System.out.println(A+B);
}else{
System.out.println(A*B);
}
}
}}
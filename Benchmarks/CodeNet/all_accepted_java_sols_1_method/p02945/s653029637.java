import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt(); 
int p = A+B;
int q = A-B;
int r = A*B;
int max = p;
if(max<q){
max = q;
}
if(max<r){
max = r;
}
System.out.println(max);
}
}

import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int A=Integer.parseInt(sc.next());
int B=Integer.parseInt(sc.next());
int C=Integer.parseInt(sc.next());
int K=Integer.parseInt(sc.next());
for(int i=0;i<K;i++){
if((A*2+B+C>=A+B*2+C)&&(A*2+B+C>=A+B+C*2)){
A*=2;
}else if((A+B*2+C>=A*2+B+C)&&(A+B*2+C>=A+B+C*2)){
B*=2;
}else if((A+B+C*2>=A*2+B+C)&&(A+B+C*2>=A+B*2+C)){
C*=2;
}
}
System.out.println(A+B+C);
}}
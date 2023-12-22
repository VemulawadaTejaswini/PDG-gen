import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int max=0;
for(int i=1;i<=Math.sqrt(n);i++){
max=Math.max(i*i,max);
}
System.out.println(max);
}}
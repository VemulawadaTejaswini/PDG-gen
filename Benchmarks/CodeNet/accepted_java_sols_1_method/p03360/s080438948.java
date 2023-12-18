import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] v=new int[3];
v[0]=Integer.parseInt(sc.next());
v[1]=Integer.parseInt(sc.next());
v[2]=Integer.parseInt(sc.next());
int K=Integer.parseInt(sc.next());
Arrays.sort(v);
for(int i=0;i<K;i++){
v[2]*=2;
}
System.out.println(v[0]+v[1]+v[2]);
}}
import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=Integer.parseInt(sc.next());
}
  int alice=0;
  int bob=0;
  Arrays.sort(a);
  int i=0;
  while(i<n){
  if(n%2==0){
  if(i%2==0){bob+=a[i];}else{alice+=a[i];}
  }else{if(i%2==0){alice+=a[i];}else{bob+=a[i];}}
  i++;}
System.out.println(alice-bob);
}}

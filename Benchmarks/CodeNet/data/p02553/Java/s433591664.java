import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long  a=sc.nextLong();
    long  b=sc.nextLong();
    long  c=sc.nextLong();
    long  d=sc.nextLong();


/*
  if (a>=0&&c>=0) {
    System.out.println(b*d);
 }
 if(d<0&&a>=0){
   System.out.println(a*d);
 }
 if (b<0&&c>=0) {
   System.out.println(b*c);
 }
 */
 long a1=a*c;
 long a2=a*d;
 long a3=b*c;
 long a4=b*d;
 long ans=0;
 if(a1>a2){
   ans=a1;
 }else{
   ans=a2;
 }
if(a3>ans){
  ans=a3;
}
if (a4>ans) {
  ans=a4;
}
System.out.println(ans);

}
}

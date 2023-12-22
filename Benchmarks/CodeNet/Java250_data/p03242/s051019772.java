import java.util.*;
class Main{
  public static void main(String[] a ){
    Scanner sc=new Scanner(System.in);
String s=sc.next();
for(int i=0;i<s.length();i++){
System.out.print(s.charAt(i)=='1'?'9':(s.charAt(i)=='9'?'1':s.charAt(i)));}System.out.println();}}  
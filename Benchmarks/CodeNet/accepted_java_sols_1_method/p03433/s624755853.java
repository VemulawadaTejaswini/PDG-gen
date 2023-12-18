import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int a=Integer.parseInt(sc.next());
String ans;
if(n%500<=a){ans="Yes";}else{ans="No";}
System.out.println(ans);
}}
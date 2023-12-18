import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int temp=n;
int fx=0;
while(temp>0){
fx+=temp%10;
temp/=10;
}
String ans="";
if(n%fx==0){ans="Yes";}else{ans="No";}
System.out.println(ans);
}}
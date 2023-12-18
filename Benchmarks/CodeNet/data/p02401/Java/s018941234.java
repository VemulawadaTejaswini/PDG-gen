package practice;
import java.util.*;

class Main{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int a,b;
int ans = 0;
for(;;){
a =sc.nextInt();
String op =sc.next();
b =sc.nextInt();
if("+".equals(op)) ans = a+b;
else if("-".equals(op)) ans = a-b;
else if("*".equals(op)) ans = a*b;
else if("/".equals(op)) ans = a/b;
else break;
System.out.println(ans);
}
}
}
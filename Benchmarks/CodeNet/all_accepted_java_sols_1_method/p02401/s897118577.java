import java.util.*;

class Main{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int a,b;
for(;;){
a =sc.nextInt();
String op =sc.next();
b =sc.nextInt();
if("+".equals(op)) System.out.println(a+b);
else if("-".equals(op)) System.out.println(a-b);
else if("*".equals(op)) System.out.println(a*b);
else if("/".equals(op)) System.out.println(a/b);
else break;
}
}
}
import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan= new Scanner(System.in);

while(true){
int a=scan.nextInt();
String b=scan.next();
int c=scan.nextInt();
if("?".equals(b))
break;
if("+".equals(b)){
System.out.println((a+c));
}
if("-".equals(b)){
System.out.println(a-c);
}
if("*".equals(b)){
System.out.println(a*c);
}
if("/".equals(b)){
System.out.println(a/c);

}

}
}
}
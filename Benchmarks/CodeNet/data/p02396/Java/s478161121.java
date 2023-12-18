import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=1;
String b=null;
while(b!="0"){
b=scan.next();
System.out.println("Case "+a+": "+b);
a=a+1;
}
}
}
import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=1;

while(true){
String B=scan.next();
int b=Integer.parseInt(B);
if(b==0)
	break;
System.out.println("Case "+a+": "+b);
a=a+1;
}
}
}
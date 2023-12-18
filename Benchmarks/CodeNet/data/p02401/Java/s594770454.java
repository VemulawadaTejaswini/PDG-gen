import java.util.Scanner;
public class Main {
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int f,n,sum=0;
String op;
while(true){
f=sc.nextInt();
op=sc.next();
n=sc.nextInt();
if(op.contains("+"))
	sum=f+n;
if(op.contains("-"))
	sum=f-n;
if(op.contains("*"))
	sum=f*n;
if(op.contains("/"))
	sum=f/n;
	
if(op.contains("?"))
	break;
System.out.println(sum);
}


}

}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int i=1;
int a;
String b="";
do{

	a=scan.nextInt();
	if(a==0)break;
		b+="Case "+i+": "+a+"\n";
			i++;
}while(a!=0);
System.out.println(b);
	}
}
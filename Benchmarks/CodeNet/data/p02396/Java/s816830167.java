import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int i = 0;

String b="";
do{
	int a=scan.nextInt();
	if(a==0)break;
		b+="Case "+i+": "+a+"\n";
		i++;
}while(true);
System.out.println(b);
	}
}
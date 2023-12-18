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
	if(i==1){
		b="Case 1: "+a;
	}
	else{
		b+="\n"+"Case "+i+": "+a;
	}
			i++;
}while(a!=0);
System.out.println(b);
	}
}
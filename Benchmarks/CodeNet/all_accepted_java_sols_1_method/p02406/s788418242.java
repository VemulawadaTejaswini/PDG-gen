import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int i=1;
int b=0,c=0,d=0,e=0,f=0;
int z=0;
do {
	z=i;
	b=z%10;
	z/=10;
	c=z%10;
	z/=10;
	d=z%10;
	z/=10;
	e=z%10;
	z/=10;
	f=z%10;
	z/=10;
	
	if(i%3==0||b==3||c==3||d==3||e==3||f==3) {System.out.print(" "+i);}
	if(a==i) {break;}
	i++;
}while(true);
System.out.println();
}
}


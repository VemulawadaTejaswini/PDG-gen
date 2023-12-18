import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=0;
int b=0;
int x=0;
int y=0;
int c[]=new int[x];
int d[]=new int[x];
do {
	a=scan.nextInt();
	b=scan.nextInt();
	if(a==0&&b==0) {
break;
	}
	if(a>b) {
		c[x]=a;
		d[x]=b;
	}
	else {
		d[x]=a;
		c[x]=b;
	}
	x++;
	y++;
}while(true);
x=0;
y=0;
do {
	if(x==y) {
		break;
	}
	System.out.println(d[x]+" "+c[x]);
	x++;
}while(true);
}
}

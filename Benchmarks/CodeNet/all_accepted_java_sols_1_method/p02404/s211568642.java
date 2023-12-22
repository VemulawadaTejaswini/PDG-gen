import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int i=0;
int a[]=new int[100];
int b[]=new int[100];
int x=0;
int y=0;
do {
	a[i]=scan.nextInt();
	b[i]=scan.nextInt();
	if(b[i]==0&&a[i]==0) {
		break;
	}
	i++;
}while(true);
i=0;
do {
	x=0;
	y=0;
	if(a[i]==0&&b[i]==0) {break;}
	do {
		if(x==b[i]) {break;}
		System.out.print("#");
		x++;
	}while(true);
	x=0;
	System.out.println();
	do {System.out.print("#");
		do {
			System.out.print(".");
		x++;
		if(x==b[i]-2) {break;}
		}while(true);
		System.out.print("#");
		y++;
		if(y==a[i]-2) {break;}
		x=0;
		System.out.println();
	}while(true);
	y=0;
	x=0;
	System.out.println();
	do {
		if(x==b[i]) {break;}
		System.out.print("#");
		x++;
	}while(true);
	x=0;
	System.out.println("\n");
	i++;
}while(true);
}
}


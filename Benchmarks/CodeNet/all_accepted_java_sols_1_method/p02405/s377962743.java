import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int i=0;
int c=0;
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
	if(b[i]==0&&a[i]==0) {
		break;
	}
	if(c%2==0) {
	if(x%2==0) {System.out.print("#");x++;}
	else {System.out.print(".");x++;}
	}
	if(c%2==1) {
	if(x%2==0) {System.out.print(".");x++;}
	else {System.out.print("#");x++;}
	}
	if(x==b[i]) {System.out.println();
	y++;
	x=0;
	c++;
	}
	if(y==a[i]) {System.out.print("\n");i++;y=0;x=0;c=0;}
}while(true);
}
}

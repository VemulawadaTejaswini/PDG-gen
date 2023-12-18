import java.io.IOException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws IOException {
Scanner scan=new Scanner(System.in);
int a[]=new int[100000];
int x=0;
int b=scan.nextInt();
int c=0;
do {
	if(x==b){
		break;
	}
	c=scan.nextInt();
	a[x]=c;
	x++;
}while(true);
x=0;
int min=100000010;
do {
	if(x==b){
		break;
	}
	if(a[x]<=min){
		min=a[x];
	}
	x++;
}while(true);
int max=-10000001;
x=0;
do {
	if(x==b){
		break;
	}
	if(a[x]>=max){
		max=a[x];
	}
	x++;
}while(true);
int sun=0;
x=0;
do {
	if(x==b){
		break;
	}
	sun+=a[x];
	x++;
}while(true);
System.out.println(min+" "+max+" "+sun);
scan.close();
	}
}
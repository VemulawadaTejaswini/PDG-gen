import java.io.IOException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws IOException {
Scanner scan=new Scanner(System.in);
int a[]=new int[100000];
int x=0;
int b=scan.nextInt();
int c=0;
int z=0;
int min=0;
int max=0;
int sun=0;
do{if(b==0) {
	break;
}
	do {

	if(x==b){
		break;
	}
	c=scan.nextInt();
	a[x]=c;
	x++;
}while(true);
x=0;
min=100000010;
do {
	if(x==b){
		break;
	}
	if(a[x]<=min){
		min=a[x];
	}
	x++;
}while(true);
 max=-10000001;
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
sun=0;
x=0;
do {
	if(x==b){
		break;
	}
	sun+=a[x];
	x++;
}while(true);
}while(z!=0);
System.out.println(min+" "+max+" "+sun);
scan.close();
	}
}
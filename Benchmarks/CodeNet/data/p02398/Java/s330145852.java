import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d[]=new int[10000];
int x=0;
int i=1;
int i2=0;
do{
if(c%i==0){
	d[x]=i;
	x++;
}
if(i==c)break;
i++;
}while(true);
x=0;
do{
	do{
		if(x==a)break;
		if(d[x]==a){
		i2++;
		break;
	}
	x++;
	}while(true);
	if(a==b)break;
	a++;
}while(true);
System.out.println(i2);
scan.close();
	}
}
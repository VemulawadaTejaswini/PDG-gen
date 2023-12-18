import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a[]=new int[3001];
int b[]=new int[3001];
int x=0;
do{
	a[x]=scan.nextInt();
	b[x]=scan.nextInt();
	if(a[x]==0&&b[x]==0)break;
	x++;
}while(true);
x=0;
do{
	if(a[x]==0&&b[x]==0)break;
	if(a[x]<b[x]){
		System.out.println(a[x]+" "+b[x]);
	}
	else{
		System.out.println(b[x]+" "+a[x]);
	}
	x++;
}while(true);
	}
}
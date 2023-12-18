import java.util.Scanner;

class Main{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
int a =sc.nextInt();
int b =sc.nextInt();

int d;
d=a/b;

int r;
r=a%b;

double k,l,m;
k=a;
l=b;
m=a/b;

System.out.print(d+" "+r+" ");
System.out.printf("%.8f",m);
}
}


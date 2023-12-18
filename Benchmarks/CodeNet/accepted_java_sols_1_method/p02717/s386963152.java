import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d;
d=a;
a=b;
b=d;
int e;
e=a;
a=c;
c=e;
System.out.println(a+" "+b+" "+c);

	}

}

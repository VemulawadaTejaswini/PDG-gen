import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);

int a=scan.nextInt();
int b=scan.nextInt();
int c,d;
double e;
c=a/b;
d=a%b;
e=(double)a/b;
System.out.println(c+" "+d+" "+e);
}
}
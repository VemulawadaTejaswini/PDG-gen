import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int r=scan.nextInt();
double a=(double)r*(double)r*3.14;
double b=(double)r*2.0*3.14;
System.out.printf("%f %f\n",a,b);
}
}
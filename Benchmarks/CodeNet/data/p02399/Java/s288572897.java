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

double aq,bq,cq;
double aq=a;
double bq=b;
double cq=a/b;

System.out.println(d+" "+r+" "+cq);

}
}


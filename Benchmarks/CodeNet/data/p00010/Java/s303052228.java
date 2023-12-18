import java.util.Scanner;
import java.math.BigDecimal;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
double x1,y1,x2,y2,x3,y3;
x1=sc.nextDouble();
y1=sc.nextDouble();
x2=sc.nextDouble();
y2=sc.nextDouble();
x3=sc.nextDouble();
y3=sc.nextDouble();
double a=(x1*x1-x2*x2)*(y2-y3)-(x2*x2-x3*x3)-(y1-y2)*(y2-y3)*(y3-y1);
double b=2*(x1-x2)*(y2-y3)-2*(x2-x3)*(y1-y2);
double px=a/b;
double py=(px-(x2+x3)/2)*(x3-x2)/(y2-y3)+(y2+y3)/2;
double r=Math.hypot(px-x1,py-y1);
BigDecimal x=new BigDecimal(px);
BigDecimal y=new BigDecimal(py);
BigDecimal z=new BigDecimal(r);
x=x.setScale(3,BigDecimal.ROUND_HALF_UP);
y=y.setScale(3,BigDecimal.ROUND_HALF_UP);
z=z.setScale(3,BigDecimal.ROUND_HALF_UP);
System.out.printf("%.3f %.3f %.3f\n",x,y,z);
}
}
}
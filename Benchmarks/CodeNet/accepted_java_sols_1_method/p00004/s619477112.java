import java.util.*;
import java.math.*;
 
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextDouble()){
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=sc.nextDouble();
double e=sc.nextDouble();
double f=sc.nextDouble();
double x=(c*e-b*f)/(a*e-b*d);
double y=(c*d-a*f)/(b*d-a*e);
BigDecimal p=new BigDecimal(x);
BigDecimal q=new BigDecimal(y);
p=p.setScale(3,BigDecimal.ROUND_HALF_UP);
q=q.setScale(3,BigDecimal.ROUND_HALF_UP);
System.out.printf("%.3f %.3f%n",p,q);
}
}
}
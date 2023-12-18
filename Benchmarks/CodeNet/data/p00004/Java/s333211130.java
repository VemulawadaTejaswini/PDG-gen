import java.util.*;
import java.math.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextDouble()){
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextnextDouble();
double d=sc.nextnextDouble();
double e=sc.nextnextDouble();
double f=sc.nextnextDouble();
double x=(c*e-b*f)/(a*e-b*d);
double y=(c*d-a*f)/(f*d-a*e);
BigDecimal p=new BigDecimal(x);
BigDecimal q=new BigDecimal(y);
p=p.setScale(3,BigDecimal.ROUND_HALF_UP);
q=q.setScale(3,BigDecimal.ROUND_HALF_UP);
System.out.printf("%.3f %.3f%n",x,y);
}
}
}
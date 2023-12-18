
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double x1,x2,y1,y2;
x1 =sc.nextDouble();
y1 =sc.nextDouble();
x2 =sc.nextDouble();
y2 =sc.nextDouble();
if(x1==x2) System.out.println(y2-y1);
else if(y1==y2) System.out.println(x2-x1);
else
System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
}
}
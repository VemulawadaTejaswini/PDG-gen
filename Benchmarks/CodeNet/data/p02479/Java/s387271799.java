import java.util.*;
import java.lang.Math;
class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	int x = cin.nextInt();
	double ans1=x*x*Math.PI;
	double ans2=2*x*Math.PI;
	System.out.printf("%f %f\n",ans1,ans2);
    }
}
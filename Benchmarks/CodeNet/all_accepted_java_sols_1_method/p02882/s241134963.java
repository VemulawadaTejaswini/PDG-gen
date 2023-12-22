import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a=sc.nextDouble(),b=sc.nextDouble(),x=sc.nextDouble();
    double s=x/a;
    if(s<=a*b/2) {
    	double w=2*s/b;
    	System.out.println(Math.atan2(b,w)/Math.PI*180);
    }else {
    	double h=2*(a*b-s)/a;
    	System.out.println(Math.atan2(h,a)/Math.PI*180);
    }
  }
}

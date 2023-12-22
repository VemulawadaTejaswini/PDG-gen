import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
  		double h=sc.nextDouble();
  		double m=sc.nextDouble();
		double mr=Math.toRadians(m*6);
  		double hr=Math.toRadians(30*h+m*0.5);
        double sar=Math.abs(mr-hr);
  		double ans=Math.sqrt(a*a+b*b-2*a*b*Math.cos(sar));

    	System.out.println(ans);
    }
}
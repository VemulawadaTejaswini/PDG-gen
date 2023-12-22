import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
   	double a=sc.nextDouble();
  	double b=sc.nextDouble();
  	double x=sc.nextDouble();
  	double c=0;
    if(x<=(a*a*b/2)){
    c=Math.toDegrees(Math.atan(a*b*b/2/x));
    }else{
    c=Math.toDegrees(Math.atan((2*b/a)-(2*x/a/a/a)));
    }
    
    System.out.println(c);
    }
}

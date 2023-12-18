import java.util.Scanner;

class Main{

    static double gcd(double a,double b){
	if(b==0) return a;
	else return gcd(b,a%b);
    }
    
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	while(sc.hasNext()){
	    double a=sc.nextDouble();
	    double b=sc.nextDouble();
	    double g=gcd(a,b);
	    System.out.printf("%.0f %.0f\n",g,(a*b)/g);
	}
    }
}
import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	double r=sc.nextDouble();


	double seki=r*r*Math.PI;
	double syu=r*2*Math.PI;
	System.out.printf("%.6f %.6f", seki,syu );
	System.out.println();
	
    }
    public static void main(String[]ag){
	new Main().main();
    }
}
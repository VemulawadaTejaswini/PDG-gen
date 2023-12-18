import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int r=sc.nextInt();
	double seki=(double)r*r*3.1415926535;
	double syu=(double)r*2*3.1415926535;
	System.out.printf("%.6f %.6f", seki,syu );
	System.out.println();
	
    }
    public static void main(String[]ag){
	new Main().main();
    }
}
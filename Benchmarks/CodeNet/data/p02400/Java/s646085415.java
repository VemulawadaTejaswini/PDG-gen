import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	double r=sc.nextDouble();
	double seki=r*r*3.1415926535897932;
	double syu=r*2*3.1415926535897932;
	System.out.printf("%.6f %.6f", seki,syu );
	System.out.println();
	
    }
    public static void main(String[]ag){
	new Main().main();
    }
}
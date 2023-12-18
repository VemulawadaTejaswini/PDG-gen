import java.util.Scanner;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	double lo=10000,hi=0;
	while(sc.hasNextDouble()){
		double high=sc.nextDouble();
		lo=Math.min(lo,high);
		hi=Math.max(hi,high);
		}
	System.out.println(hi-lo);
    }
 }
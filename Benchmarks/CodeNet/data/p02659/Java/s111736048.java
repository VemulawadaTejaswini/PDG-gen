import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
	double B = sc.nextDouble();
	double Bs = B*100;
	
	System.out.print((long)((A*Bs)/100));
        
    }
}

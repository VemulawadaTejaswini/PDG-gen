import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
	double B = sc.nextDouble();
	
	System.out.print(A*(int)B + (long)(A*(B%1)));
        
    }
}

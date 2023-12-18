import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
	double B = sc.nextDouble();
	double Bs = B*100;
	long s1 = A*(long)B;
	long s2 = (long)(A*(B%1));
	System.out.print(s1 + s2);
        
    }
}

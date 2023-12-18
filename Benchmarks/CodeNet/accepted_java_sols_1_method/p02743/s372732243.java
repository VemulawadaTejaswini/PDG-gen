import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	long c = sc.nextLong();
	long d =  c - a - b;
	if((d>0) && (d*d > 4*a*b))
	    System.out.print("Yes");
	else
	    System.out.print("No");
    }
}

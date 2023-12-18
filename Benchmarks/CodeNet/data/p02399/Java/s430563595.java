import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();

	int d = a / b;
	int r = a % b;
	double f = (double)a / b;
	System.out.println(d+" "+r+" "+String.format("%.5f",f));
    }
}


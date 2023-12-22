import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int a = input.nextInt();
    	int b = input.nextInt();
    	int r = input.nextInt();
    	DecimalFormat df = new DecimalFormat("#.#########");
    	double S = (double)(a*b*Math.sin(Math.toRadians(r)))/2;
    	double R = a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-2*a*b*Math.cos(Math.toRadians(r)));
    	double T = (S*2)/a;
    	System.out.println(df.format(S)+" "+df.format(R)+" "+df.format(T));
    }
}
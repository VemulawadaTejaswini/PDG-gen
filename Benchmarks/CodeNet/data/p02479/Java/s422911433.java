import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	double r = input.nextDouble();
    	DecimalFormat df = new DecimalFormat("#.##########");
    	System.out.println(df.format(r*r*Math.PI)+" "+df.format(r*2*Math.PI));
    }
}
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int a = input.nextInt();
    	int b = input.nextInt();
    	DecimalFormat df = new DecimalFormat("#.##########");
    	df.format((double)a/b);
    	System.out.println((int)a/b+" "+a%b+" "+df.format((double)a/b));
    }
}
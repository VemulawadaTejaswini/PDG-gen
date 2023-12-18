import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int d = x/y;
    	int r = x%y;
    	double f = (double)x/(double)y;
    	System.out.println(d+" "+r+" "+String.format("%.5f", f));

    }
}
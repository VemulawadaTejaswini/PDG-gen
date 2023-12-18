import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	
    	int x = a/b;
    	int y = a%b;
    	double z = 1.0*a/b;

      	System.out.println(x +" " +y+" "+String.format("%.5f",z));
    	
    }

}
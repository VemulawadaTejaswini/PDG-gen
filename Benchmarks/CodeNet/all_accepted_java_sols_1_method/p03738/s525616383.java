import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());

        if (a > b){
        	System.out.println("GREATER");
        }else if (b > a){
        	System.out.println("LESS");
        }else {
        	System.out.println("EQUAL");
        }
    }
}
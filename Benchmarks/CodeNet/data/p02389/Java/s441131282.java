import java.util.Scanner;

public class AOJ {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String xy = stdIn.nextLine();
        int x = Character.getNumericValue(xy.charAt(0));
        int y = Character.getNumericValue(xy.charAt(2));
        System.out.println((x*y)+" "+(2*x+2*y));   
    }   
}
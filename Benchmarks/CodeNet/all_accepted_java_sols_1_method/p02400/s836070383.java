import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double inta = Double.parseDouble(str);
 
        System.out.printf("%f %f", inta*inta*Math.PI, inta*2*Math.PI );
 
    }
 
}
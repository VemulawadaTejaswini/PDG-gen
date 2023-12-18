import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int inta = Integer.parseInt(str);
 
        System.out.printf("%f %f", (double)inta*inta*Math.PI, (inta+inta)*Math.PI );
 
    }
 
}
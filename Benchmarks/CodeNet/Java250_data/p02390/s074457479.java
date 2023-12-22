import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int S = new Scanner(System.in).nextInt();

        int h = S / 3600;
        int m = (S - h * 3600) / 60; 
        int s = S - (h * 3600 + m * 60);                                        

        out.printf("%d:%d:%d%n", h, m ,s);
    }   
}
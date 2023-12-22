import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            String in = sc.next().trim();
            
            if ("ABC".equals(in)) {
                System.out.println("ARC");
            } else {
                System.out.println("ABC");
            }
        }
    }
}
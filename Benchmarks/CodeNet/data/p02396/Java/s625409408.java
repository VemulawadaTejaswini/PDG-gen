package aoj4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            
            if ("0".equals(line)) {
                break;
            } else {
                System.out.println("Case " + i + ": " + line);
            }
            i++;
        }
    }
}
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String passS = scan.nextLine();
        String passT = scan.nextLine();
        int moji = passS.length();
        String passTa = passT.substring(0,moji);
        if (passS.equals(passTa)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String oldID = scan.nextLine();
        String newID = scan.nextLine();

        for(int i = 0; i < oldID.length(); i++) {
            if(oldID.charAt(i) != newID.charAt(i)) {
                System.out.println("No");
                scan.close();
                return;
            }
        }
        System.out.println("Yes");
        scan.close();
        return;
    }
}
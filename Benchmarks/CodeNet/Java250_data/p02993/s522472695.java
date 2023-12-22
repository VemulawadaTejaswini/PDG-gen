import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = false;

        for (int i = 0; i <s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Bad");
        
        } else {
            System.out.println("Good");
        }
    }
}
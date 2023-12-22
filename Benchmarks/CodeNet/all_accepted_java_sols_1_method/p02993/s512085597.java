import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean result = true;
        for (int i = 0; i < 3; i++) {
            if (S.substring(i,i+1).equals(S.substring(i+1,i+2))) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }

    }
}
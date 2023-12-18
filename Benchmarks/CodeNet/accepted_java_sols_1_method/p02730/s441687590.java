import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = str.length();

        if (str.substring(0,(N-1)/2).equals(str.substring(((N+3)/2)-1))) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

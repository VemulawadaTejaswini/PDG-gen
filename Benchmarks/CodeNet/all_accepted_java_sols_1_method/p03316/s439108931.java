import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int n = Integer.parseInt(temp);
        int s = 0;
        String orary = "";
        for (int i = 0; i < temp.length(); i++) {
            s += temp.charAt(i) - '0';
        }

        if (n % s == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String s = sc.nextLine();
        sc.close();

        String nP = p + p;
        if(nP.contains(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


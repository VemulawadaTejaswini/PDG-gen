import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 += s1;
        if(s1.contains(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}

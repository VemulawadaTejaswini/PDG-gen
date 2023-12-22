import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuffer sbA = new StringBuffer();
        for (int i = 0; i < a; i++) {
            sbA.append(b);
        }

        StringBuffer sbB = new StringBuffer();
        for (int j = 0; j < b; j++) {
            sbB.append(a);
        }

        if (sbA.toString().compareTo(sbB.toString()) >= 0) {
            System.out.println(sbB);
        } else {
            System.out.println(sbA);
        }
    }

}

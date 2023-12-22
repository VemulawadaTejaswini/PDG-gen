import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String str[] = new String[3];
        str = n.split("");
        int a[] = new int[3];
        for (int i = 0; i < 3; i++)
            a[i] = Integer.parseInt(str[i]);
        for (int i = 0; i < 3; i++) {
            if (a[i] == 1)
                a[i] = 9;
            else if (a[i] == 9)
                a[i] = 1;
        }
        System.out.println(String.valueOf(a[0]) + String.valueOf(a[1]) + String.valueOf(a[2]));
    }
}

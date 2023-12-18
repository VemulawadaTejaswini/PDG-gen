import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int diff = 'a' - 'A';
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] -= diff;
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] += diff;
            }
        }

        s = new String(c);
        System.out.println(s);
    }
}
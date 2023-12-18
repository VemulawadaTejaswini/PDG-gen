import java.util.Scanner;
class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        if (s.length() > k) {
            s = s.substring(0, k) + "...";
        }
        System.out.println(s);
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");

        int count = 0;
        String last = "";
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals(last)) {
                count++;
                last = s[i];
            }
        }

        System.out.println(count - 1);
    }
}
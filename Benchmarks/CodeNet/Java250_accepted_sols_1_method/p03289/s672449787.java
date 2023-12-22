import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        if(s[0] == 'A') {
            int count = 0;
            for (int i = 2; i < s.length - 1; i++) {
                if(s[i] == 'C') {
                    count++;
                }
            }
            if(count == 1) {
                count = 0;
                for (int i = 0; i < s.length; i++) {
                    if(Character.isUpperCase(s[i])) {
                        count++;
                    }
                }
                if(count == 2) {
                    System.out.println("AC");
                    return;
                }
            }
        }
        System.out.println("WA");
    }
}
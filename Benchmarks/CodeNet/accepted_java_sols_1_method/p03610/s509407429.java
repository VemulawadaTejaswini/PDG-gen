import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();

        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length; i+=2) {
            str.append(s[i]);
        }
        System.out.println(str);
        sc.close();
    }
}

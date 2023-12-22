import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 97 && c <= 122) c -= 32;
            else if(c >= 65 && c <= 90) c += 32;

            sb.append(c);
        }

        System.out.println(sb.toString());

        sc.close();
    }
}

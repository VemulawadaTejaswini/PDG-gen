import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = sc.next();
        char res = ' ';
        switch (b.charAt(0)) {
            case 'A':
                res = 'T';
                break;
            case 'C':
                res = 'G';
                break;
            case 'G':
                res = 'C';
                break;
            case 'T':
                res = 'A';
                break;
        }

        System.out.println(res);
    }
}

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int start = 0, end = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'A') {
                start = i;
                break;
            }
        }

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(s.length() - 1 - i) == 'Z') {
                end = s.length() - 1 - i;
                break;
            }
        }
        System.out.println(end - start + 1);
    }
}


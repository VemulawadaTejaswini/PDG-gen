import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();

        char[] c = C.toCharArray();
        for(char c1 : c) {
            int code = (int)c1;
            code = code + 1;
    
            char c2 = (char)code;
            System.out.println(c2);
        }
    }
}
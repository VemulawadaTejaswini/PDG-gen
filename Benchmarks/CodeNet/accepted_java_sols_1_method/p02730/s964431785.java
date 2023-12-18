import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();
        int sLength = S.length();

        String a = S.substring(0, (sLength-1)/2);
        String b = S.substring((sLength+3)/2 - 1 ,sLength);

        if(a.equals(b)) { 
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
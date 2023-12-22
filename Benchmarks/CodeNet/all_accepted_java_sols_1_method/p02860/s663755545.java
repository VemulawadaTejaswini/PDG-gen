import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sLength = in.nextInt();
        if(sLength <= 100 && sLength >= 0) {
            String stri = in.next();
            if(sLength == stri.length()) {
                boolean allAcceptable = true;
                for (int i = 0; i < sLength; i++) {
                    char c = stri.charAt(i);
                    if(Character.isUpperCase(c) || !Character.isLetter(c)) {
                        allAcceptable = false;
                    }
                }
                if(allAcceptable) {
                    String first = stri.substring(0,sLength/2);
                    String second = stri.substring(sLength/2);
                    if(first.equals(second)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }

    }
}

import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();
        if (s.charAt(s.length()-1) == 's') {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }


}


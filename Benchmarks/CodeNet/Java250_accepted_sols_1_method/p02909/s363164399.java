

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.equals("Sunny") || s.equals("Rainy") || s.equals("Cloudy")) {
            if (s.equals("Sunny")) {
                System.out.println("Cloudy");
            } else if (s.equals("Cloudy")) {
                System.out.println("Rainy");
            } else {
                System.out.println("Sunny");
            }
        }
    }
}

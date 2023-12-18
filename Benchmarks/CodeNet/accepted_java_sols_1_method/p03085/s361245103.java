import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();

        switch(b){
            case "A":
                out.println("T");
                break;
            case "C":
                out.println("G");
                break;
            case "G":
                out.println("C");
                break;
            case "T":
                out.println("A");
                break;

        }
    }
}
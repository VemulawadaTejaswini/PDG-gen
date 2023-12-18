import java.util.*;

public class Main {
    private static final String EOF = "END OF INPUT";

    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            String str;
            while(!(str = scn.nextLine()).equals(EOF)) {
                String[] ary = str.split(" ");
                for(String elm : ary) {
                    System.out.print(elm.length());
                }
                System.out.println();
            }
        }
    }
}
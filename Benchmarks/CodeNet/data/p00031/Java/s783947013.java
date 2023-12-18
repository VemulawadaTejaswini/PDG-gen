import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int weight;
            while((weight = scn.nextInt()) > 0) {
                boolean flg = false;
                for(int i = 0; i < 10; i++) {
                    if((weight & 1 << i) > 0) {
                        System.out.print((flg ? " " : "") + (1 << i));
                        flg = true;
                    }
                }
                System.out.println();
            }
        }
    }
}
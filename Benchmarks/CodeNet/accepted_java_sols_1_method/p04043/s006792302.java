

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String input = in.nextLine();
        input=input.replaceAll(" ","");
        if (input.matches("557")||input.matches("755")||input.matches("575")) System.out.println("YES");
        else System.out.println("NO");

    }
}

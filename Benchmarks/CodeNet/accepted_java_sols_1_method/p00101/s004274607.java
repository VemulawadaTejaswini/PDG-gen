import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(int n = Integer.parseInt(scn.nextLine()); n > 0; n--) {
            System.out.println(scn.nextLine().replace("Hoshino", "Hoshina"));
        }
    }
}
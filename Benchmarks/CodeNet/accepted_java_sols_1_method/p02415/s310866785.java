import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[] ary = scn.nextLine().toCharArray();
        for(char elm : ary) {
            if(Character.isLowerCase(elm)) {
                System.out.print(Character.toUpperCase(elm));
            } else {
                System.out.print(Character.toLowerCase(elm));
            }
        }
        System.out.println();
    }
}
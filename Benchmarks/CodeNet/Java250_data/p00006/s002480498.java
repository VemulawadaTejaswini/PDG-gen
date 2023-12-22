import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        char [] str = sc.next().toCharArray();
        for(int x = str.length-1; x >= 0; x--) {
            System.out.print(str[x]);
        }

        System.out.print("\n");
    }
}
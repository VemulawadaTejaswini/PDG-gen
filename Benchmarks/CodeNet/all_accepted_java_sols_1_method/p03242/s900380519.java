import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        n = n.replaceAll("1","a");
        n = n.replaceAll("9","b");
        n = n.replaceAll("a","9");
        n = n.replaceAll("b","1");

        System.out.println(n);

    }
}
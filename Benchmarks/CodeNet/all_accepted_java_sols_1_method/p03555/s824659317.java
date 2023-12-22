import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cn1 = sc.next().split("");
        String[] cn2 = sc.next().split("");

        System.out.println((cn1[0].equals(cn2[2]) &&
                            cn1[1].equals(cn2[1]) &&
                            cn1[2].equals(cn2[0])) ? "YES" : "NO");
    }

}
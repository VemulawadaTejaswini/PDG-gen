import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");

        int a = Integer.parseInt(abt[0]); // creation sec
        int b = Integer.parseInt(abt[1]); // creation lot num
        int t = Integer.parseInt(abt[2]); // stop sec

        int creationCount = t / a;
        int created = creationCount * b;

        System.out.println(created);
    }
}
import java.util.*;

class Main {


    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        line = line.replaceAll("apple", "APPLE");
        line = line.replaceAll("peach", "apple");
        line = line.replaceAll("APPLE", "peach");

        System.out.println(line);

    }
}
import java.util.*;

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        while(sc.hasNext()) {
            String line = sc.nextLine();
            line = line.replace("Hoshino", "Hoshina");
            System.out.println(line);
        }

    }
}
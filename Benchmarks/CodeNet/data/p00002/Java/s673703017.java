import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] req = s.split(" ");
            System.out.println(String.valueOf(Integer.parseInt(req[0]) + Integer.parseInt(req[1])).length());
        }

    }
}
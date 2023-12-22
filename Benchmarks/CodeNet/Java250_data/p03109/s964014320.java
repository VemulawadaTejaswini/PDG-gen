import java.text.SimpleDateFormat;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").parse(scanner.next()).getTime() <= 1556550000000L ? "Heisei" : "TBD");
    }
}
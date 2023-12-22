import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contest = scanner.next().trim();

        if("ABC".equals(contest)){
            System.out.println("ARC");
        }else{
            System.out.println("ABC");
        }
    }
}

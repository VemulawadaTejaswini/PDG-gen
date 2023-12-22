import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int pageNum = 0;

        Scanner scanner = new Scanner(System.in);
        String inputPageNum = scanner.nextLine();
        scanner.close();
        pageNum = Integer.parseInt(inputPageNum);

        int printOutPage = 0;
        if (pageNum % 2 == 0) {
            printOutPage = pageNum / 2;
        } else {
            printOutPage = pageNum / 2 + 1;
        }
        System.out.println(printOutPage);

    }
}
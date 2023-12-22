import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Double sum = 0.0;
        for (int i = 0; i< n; i++) {
            String temp = sc.nextLine();
            String[] tempArr = temp.split(" ");

            if (tempArr[1].compareTo("JPY") == 0 ) {
                sum += Double.parseDouble(tempArr[0]);
            } else if (tempArr[1].compareTo("BTC") == 0) {
                sum += Double.parseDouble(tempArr[0]) * 380000.0;
            }
        }

        System.out.println(sum.doubleValue());

    }

}
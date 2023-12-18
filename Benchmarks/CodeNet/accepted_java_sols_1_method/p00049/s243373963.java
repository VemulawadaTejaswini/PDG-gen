import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[4];
        while (sc.hasNext()) {
            String[] b = sc.nextLine().split(",");
            switch (b[1]) {
            case "A":
                l[0]++;
                break;
            case "B":
                l[1]++;
                break;
            case "AB":
                l[2]++;
                break;
            case "O":
                l[3]++;
                break;
            }
        }
        for (int i : l) {
            System.out.println(i);
        }
    }
}

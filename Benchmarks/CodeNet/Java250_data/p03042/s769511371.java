import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int l = Integer.parseInt(s.substring(0, 2));
        int r = Integer.parseInt(s.substring(2, 4));

        if (!isMonth(l) && !isMonth(r)) {
            System.out.println("NA");
        } else if (isMonth(l) && isMonth(r)) {
            System.out.println("AMBIGUOUS");
        } else if (isMonth(r)) {
            System.out.println("YYMM");
        } else {
            System.out.println("MMYY");
        }
    }
    static boolean isMonth(int num) {
        return num > 0 && num <= 12;
    }
}
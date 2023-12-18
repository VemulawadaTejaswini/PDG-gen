import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        int weeks = new Scanner(System.in).nextInt();
        double debt = 100000;
        for(int i = 0; i < weeks;i++) {
            debt *= 1.05;
            double fraction = debt % 1000;
            if (fraction != 0)debt += 1000 - fraction;
        }
        System.out.println((long)debt);
}
}
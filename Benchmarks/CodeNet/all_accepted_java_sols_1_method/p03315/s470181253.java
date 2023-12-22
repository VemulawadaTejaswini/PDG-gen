import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s;
        try(Scanner cin = new Scanner(System.in)) {
            s = cin.next();
        }
        long count = s.chars().filter((c) -> c == '+').count();
        System.out.println(count - (4 - count));
    }

}
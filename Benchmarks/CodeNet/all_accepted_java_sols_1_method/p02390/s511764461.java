import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int secs = sc.nextInt();
            int hh = secs / (60 * 60);
            int hs = secs % (60 * 60);
            int mm = hs / 60;
            int ss = hs % 60;
            System.out.println(String.format("%d:%d:%d", hh, mm, ss));
        }
    }
}


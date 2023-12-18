import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // AtCoder *s* Contest
        String line = sc.nextLine();
        
        String[] ws = line.split(" ");
        System.out.println("A" + ws[1].charAt(0) + "C");
    }
}

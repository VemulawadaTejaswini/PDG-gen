import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] inst = in.split(" ");
        int x = Integer.parseInt(inst[0]);
        int y = Integer.parseInt(inst[1]);
        System.out.println(x*y + " " + (x+y)*2);
    }
}


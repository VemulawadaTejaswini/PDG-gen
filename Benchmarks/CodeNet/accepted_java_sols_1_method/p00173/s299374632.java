import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            String[] lines=sc.nextLine().split(" ");
            System.out.println(lines[0]+" "+(Integer.parseInt(lines[1])+Integer.parseInt(lines[2]))+" "+(Integer.parseInt(lines[1])*200+Integer.parseInt(lines[2])*300));
        }
    }
}

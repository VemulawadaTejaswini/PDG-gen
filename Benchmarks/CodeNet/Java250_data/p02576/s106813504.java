import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ", 0);

        int num = Integer.parseInt(lines[0]);
        int make = Integer.parseInt(lines[1]);
        int time = Integer.parseInt(lines[2]);

        int ret = time * (int)(Math.ceil(1.0 * num / make));
        
        System.out.println(ret);
    }
}

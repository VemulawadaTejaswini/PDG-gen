import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        
        line = sc.nextLine();
        String[] lines = line.split(" ", 0);

        int before = Integer.parseInt(lines[0]);
        long sum = 0;
        for (int i = 1; i < lines.length; i++) {
            int now = Integer.parseInt(lines[i]);
            if (now < before) {
                sum+= before - now;
            } else {
                before = now;
            }
        }
        
        System.out.println(sum);
    }
}

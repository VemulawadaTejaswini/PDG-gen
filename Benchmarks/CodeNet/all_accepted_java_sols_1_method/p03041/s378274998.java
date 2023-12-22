import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        String line2 = sc.nextLine();
        char[] line3 = line2.toCharArray();
        
        char c = line2.charAt(b - 1);
        c += 32;
        line3[b - 1] = c;
        for(char c1 : line3) {
            System.out.print(c1);
        }
    }
}
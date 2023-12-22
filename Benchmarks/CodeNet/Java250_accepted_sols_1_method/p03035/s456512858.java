import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a >= 13)
        System.out.println(b);
        else if(a <= 12 && a >= 6)
        System.out.println(b / 2);
        else
        System.out.println(0);
    }
}
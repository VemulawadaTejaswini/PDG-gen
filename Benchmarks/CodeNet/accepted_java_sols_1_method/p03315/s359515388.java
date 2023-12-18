import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        
        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (s[i].equals("+")) result++;
            else if (s[i].equals("-")) result--;
        }
        System.out.println(result);
    }
}

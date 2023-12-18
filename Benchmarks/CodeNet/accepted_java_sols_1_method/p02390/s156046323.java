import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hour = seconds / 3600;
        int min = seconds % 3600 / 60;
        int sec = seconds % 60;
        System.out.printf("%d:%d:%d%n",hour,min,sec);
        sc.close();
    }
}


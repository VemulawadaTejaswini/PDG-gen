import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ji = num / 3600;
        int hunn = (num % 3600) / 60;
        int byou = (num % 3600) % 60;
        System.out.println(ji + ":" + hunn + ":" + byou);
    }
}


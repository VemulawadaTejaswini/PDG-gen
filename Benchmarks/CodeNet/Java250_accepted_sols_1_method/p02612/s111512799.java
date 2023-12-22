


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n % 1000 > 0 ? 1000 - n % 1000 : 0);
    }
}
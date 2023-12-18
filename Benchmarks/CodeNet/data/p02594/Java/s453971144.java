import java.util.Scanner;

class Solution {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int temperature = in.nextInt();
        System.out.println(temperature >= 30 ? "Yes" : "No");
    }
}
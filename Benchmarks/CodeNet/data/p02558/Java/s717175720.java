import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if(Math.abs(a - b) % 10 == 0) {
                System.out.println(Math.abs(a - b)/10);
            } else System.out.println(Math.abs(a - b)/10 + 1);
        }
    }
}

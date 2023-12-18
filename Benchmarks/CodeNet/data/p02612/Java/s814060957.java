import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 1000 == 0)
            System.out.println(0);
        else 
            System.out.println(Math.abs(n % 1000 - 1000));

    }
}
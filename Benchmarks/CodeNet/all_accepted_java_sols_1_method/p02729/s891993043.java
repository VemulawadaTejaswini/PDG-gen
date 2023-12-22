import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = (a*(a -1))/2;
        sum += (b * (b-1)) /2;
        System.out.println(sum);
    }
}

import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            if(i % 2 == 1 && num % 2 == 1)
                count++;
        }
        System.out.println(count);
    }
}
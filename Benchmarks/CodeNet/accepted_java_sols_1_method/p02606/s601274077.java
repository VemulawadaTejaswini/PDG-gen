import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for(int i = l; i <= r; i++)
            if(i % d == 0)
                count++;
            System.out.println(count);
    }

}
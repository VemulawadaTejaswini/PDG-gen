import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        for(int i = 1; i <= n; i++){
            if((1 <= i && i <= 9) || (100 <= i && i <= 999) || (10000 <= i && i <= 99999))  count++;
        }
        System.out.println(count);
    }
}
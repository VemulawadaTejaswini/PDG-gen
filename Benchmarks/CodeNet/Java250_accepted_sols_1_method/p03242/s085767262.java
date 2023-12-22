import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n / 100 == 9) n -= 800;
        else n += 800;
        if((n%100) / 10 == 9) n -= 80;
        else n += 80;
        if((n%10) / 1 == 9) n -= 8;
        else n += 8;
        System.out.println(n);
        sc.close();

    }

}

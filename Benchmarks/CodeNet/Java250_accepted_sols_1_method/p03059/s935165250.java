import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        int i = a;
        int j = 0;

        while(i <= t + 0.5){
            i += a;
            j += b;
        }
        System.out.println(j);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Xstr = sc.next();
        String Ystr = sc.next();

        long X = Long.parseLong(Xstr);
        long Y = Long.parseLong(Ystr);

        long count = 0L;

        long cursor = X;
        while(cursor <= Y){
            count = count + 1L;
            cursor = cursor * 2;
        }
        System.out.println(count);
    }
}

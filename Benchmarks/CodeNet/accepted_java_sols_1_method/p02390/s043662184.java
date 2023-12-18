import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int S, h, m, s;
        S = Integer.parseInt(str);
        h = S / 3600;
        S = S % 3600;
        m = S / 60;
        s = S % 60;
        System.out.println(h+":"+m+":"+s);
    }
    
}
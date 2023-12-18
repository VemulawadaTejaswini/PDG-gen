import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h;
        h = S / 3600;
        int m;
        m = (S % 3600)/60;
        int s;
        s = (S % 3600)%60;
        
        System.out.println(h + ":" + m + ":" + s);
    }
}


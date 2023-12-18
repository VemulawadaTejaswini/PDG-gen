import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int l = scan.nextInt();
        int out = 0;
        out += d / l;
        out += d % l;
        System.out.println(out);
        scan.close();
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextInt()*2+1;
        System.out.println((int)Math.ceil(n/d));
    }
}

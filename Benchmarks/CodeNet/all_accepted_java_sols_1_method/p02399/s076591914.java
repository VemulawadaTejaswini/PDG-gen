import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.printf("%d %d %f",a/b,a%b,a/(double)b);
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d[] = new int[3];
        d[0]=a*b;
        d[1]=a+b;
        d[2]=a-b;
        Arrays.sort(d);
        System.out.println(d[2]);
    }
}

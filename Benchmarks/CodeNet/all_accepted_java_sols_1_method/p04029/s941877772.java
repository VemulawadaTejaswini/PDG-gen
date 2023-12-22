import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),g=0;
        for(int i=1;i<=n;i++)
            g+=i;
        System.out.println(g);
    }
}

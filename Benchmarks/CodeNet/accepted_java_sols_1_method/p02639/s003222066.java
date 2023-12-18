import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for(int i=1; i<=5; i++) {
            int x = sc.nextInt();
            if(i!=x) {
                result = i;
            }
        }
        System.out.println(result);
    }
}

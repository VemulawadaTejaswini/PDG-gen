import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean state = true;
        for(int i = 0; i < N; i++){
            if(sc.next().equals("Y")) state = false;
        }
        System.out.println(state ? "Three" : "Four");
    }
}

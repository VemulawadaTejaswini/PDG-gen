import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        
        for(int i = 2001; i <= 2010; i++){
            x = r * x - D;
            System.out.println(x);
        }
    }
}

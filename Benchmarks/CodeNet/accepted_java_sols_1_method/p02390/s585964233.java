import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        
        int h = 0;
        int m = 0;
        int s = 0;
        
        h = S / 3600;
        if(h > 0){
            S = S % 3600;
        }
        m = S / 60;
        if(m > 0){
            S = S % 60;
        }
        s = S;
        System.out.println(h + ":" + m + ":" + s);
    }
}
 

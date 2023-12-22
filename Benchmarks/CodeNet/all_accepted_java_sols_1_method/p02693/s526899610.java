import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int k = sn.nextInt();
        int a = sn.nextInt();
        int b = sn.nextInt();
        
        for(int i = a; i <= b; i++) {
            if(i % k == 0) {
                System.out.print("OK");
                return;
            }
        }
        System.out.print("NG");
	}
}

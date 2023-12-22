import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(n == Math.pow(2,i)){
                System.out.println((int)Math.pow(2,i));
                break;
            }else if(n < Math.pow(2,i)){
                System.out.println((int)Math.pow(2,i-1));
                break;
            }
        }
    }
}

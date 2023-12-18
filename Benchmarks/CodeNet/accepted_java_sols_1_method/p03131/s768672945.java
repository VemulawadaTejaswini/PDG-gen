import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b-a<=2){
            System.out.println(1+k);
        }else {
            int kk = k+1-a;
            System.out.println((b-a)*(kk/2L)+kk%2+a);
        }
    }
}

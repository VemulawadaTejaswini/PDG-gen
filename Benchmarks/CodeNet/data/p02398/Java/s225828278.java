import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0 && a <= i && i <=b){
                m++;
            }
            if(b < i)break;
        }
        System.out.print(m);
        System.out.println();
    }
}

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 1; i < K + 1; i ++){
            int n = A|B|C;
            if(n == A){
                if(i == 1){
                int m = 2 * i * n;
                a = m;
                }
        }
    }
        for(int j = 1; i < K + 1; i ++){
            int s = A|B|C;
            if(n == A){
                if(i == 1){
                int g = 2 * j * s;
                b = g;
                }
        }
    }
        for(int l = 1; i < K + 1; i ++){
            int h = A|B|C;
            if(n == A){
                if(i == 1){
                int y = 2 * l * h;
                c = y;
                }
        }
    }
        if(b > a && c > a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
}
}
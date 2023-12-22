import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //レンガの数
        int count = 0;
        int  a = 0;
        for(int i = 1; i <= N; i++) {
            a = sc.nextInt();
            if(a == count+1) {
                count++;
            }
        }
        
        if(count == 0) {
            System.out.println(-1);
        }else {
            System.out.println(N-count);
        }
    }
}
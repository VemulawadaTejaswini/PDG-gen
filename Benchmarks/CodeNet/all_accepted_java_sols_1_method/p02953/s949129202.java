import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pre = sc.nextInt();;
        boolean end = false;
        for(int i=1; i<N; i++) {
            int H = sc.nextInt();
            if(pre > H) {
                System.out.println("No");
                end = true;
                break;
            }
            if (pre < H) {
                pre = H-1;
            } else {
                pre = H;
            }
        }
        if (!end) {
            System.out.println("Yes");
        }
    }
}
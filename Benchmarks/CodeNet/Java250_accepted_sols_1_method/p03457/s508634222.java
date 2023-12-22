import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        int x = 0;
        int y = 0;

        for(int i=0; i<n; i++){
            int memo_t = sc.nextInt();
            int memo_x = sc.nextInt();
            int memo_y = sc.nextInt();

            int d = memo_t - t;
            int dist = Math.abs(memo_x - x) + Math.abs(memo_y -y);
            if((d < dist) || ((dist - d)%2 != 0)){
                System.out.println("No");
                return;
            }
            t = memo_t;
            x = memo_x;
            y = memo_y;
        }
        System.out.println("Yes");
    }
}

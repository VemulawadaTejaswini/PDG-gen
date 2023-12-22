import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int ans = -1;
        int ax, bx;
        for(int i = 1; i <= 1000; i++){
            ax = (int) (i * 0.08);
            bx = (int) (i * 0.1);
            if(ax == A && bx == B){
                ans = i;
                break;
            }
        }
        System.out.print(ans);
    }
}

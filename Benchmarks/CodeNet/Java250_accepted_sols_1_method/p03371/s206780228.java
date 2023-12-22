import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int AB = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        int ans = 1000000000;
        for(int i=0; i<2*(x+y)+1; i++){
            int ABpizza = i;
            int Apizza = Math.max(0,x - (i/2));
            int Bpizza = Math.max(0,y - (i/2));
            ans = Math.min(ans,(ABpizza*AB)+(Apizza*A)+(Bpizza*B));
        }
        System.out.println(ans);
    }
}
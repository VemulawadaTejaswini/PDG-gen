import javax.swing.text.MaskFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = (int)1e9;
        int A=scan.nextInt();
        int B=scan.nextInt();
        int C=scan.nextInt();
        int X=scan.nextInt();
        int Y=scan.nextInt();



        for(int i = 0;i < 2*(X+Y)+1;i++){
                int ABpizza = i;
                int Apizza = Math.max(X - i / 2,0);
                int Bpizza = Math.max(Y - i / 2,0);
                
                ans = Math.min(ans, Apizza * A + Bpizza * B + ABpizza * C);
        }
        System.out.println(ans);
    }
}
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();

        int ans = (int)1e9;

    for(int i=0;i<2*(X+Y)+1;i++){
        int ABpizza = i;
        int Apizza = X-(i/2)>0 ? X-(i/2):0;
        int Bpizza = Y-(i/2)>0 ? Y-(i/2):0;
        ans = Math.min(ans,Apizza*A+Bpizza*B+ABpizza*C);
    }
    System.out.println(ans);

    }
}
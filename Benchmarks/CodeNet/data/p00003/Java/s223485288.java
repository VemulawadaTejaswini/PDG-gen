import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int [] es = new int[3];
            for(int j=0;j<3;j++) es[j] = in.nextInt();
            Arrays.sort(es);
            if(sq(es[0]) + sq(es[1]) == sq(es[2])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    static int sq(int x){ return x*x; };

}
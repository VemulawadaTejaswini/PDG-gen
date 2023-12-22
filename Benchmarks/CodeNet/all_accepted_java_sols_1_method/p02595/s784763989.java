import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();
        int p=0;
for(int i=0;i<N;i++){
    int X=scan.nextInt();
    int Y=scan.nextInt();

    if (Math.pow(X,2)+Math.pow(Y,2)<=Math.pow(D,2)){p++;}
}
System.out.println(p);
    }

}


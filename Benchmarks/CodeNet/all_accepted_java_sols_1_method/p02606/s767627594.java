import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L=scan.nextInt();
        int R=scan.nextInt();
        int d=scan.nextInt();
int S1=(int)(L-1)/d;
        int S2=(int)R/d;
        int p=S2-S1;
        System.out.println(p);



    }
}

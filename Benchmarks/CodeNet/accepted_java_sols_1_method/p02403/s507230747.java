import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int H=scan.nextInt();
    int W=scan.nextInt();

    while (H != 0 || W != 0) {

        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        H=scan.nextInt();
        W=scan.nextInt();
    }
    }
}

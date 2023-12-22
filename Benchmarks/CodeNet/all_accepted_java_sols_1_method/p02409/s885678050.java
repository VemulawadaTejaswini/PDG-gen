import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] [] [] buidings = new int[4][3][10];
        for(int b = 0; b < 4; b++){
            for(int f = 0;  f< 3; f++){
                for(int r = 0; r < 10; r++){
                    buidings [b] [f] [r] = 0;
                }
            }
        }
        for(int x = 0; x <n; x++){
            int b = scan.nextInt() - 1;
            int f = scan.nextInt() - 1;
            int r = scan.nextInt() - 1;
            int v = scan.nextInt();
            buidings [b] [f] [r] = buidings [b] [f] [r] + v;
        }
        for(int b = 0; b < 4; b++){
            for(int f = 0;  f< 3; f++){
                System.out.print(" ");
                for(int r = 0; r < 10; r++){
                    if(r == 9){
                        System.out.println(buidings [b] [f] [r]);
                    }
                    else {
                        System.out.print(buidings[b][f][r] + " ");
                    }
                }
            }
            if(b < 3) {
                System.out.println("####################");
            }
        }
    }
}

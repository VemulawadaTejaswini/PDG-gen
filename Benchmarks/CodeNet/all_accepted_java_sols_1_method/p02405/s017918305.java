import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        boolean dot;
        int h =0;
        int w = 0;
        while(H !=0 && W != 0){
            while(h < H){
                if(h == 0 || h % 2 == 0){
                    dot = false;
                }
                else{
                    dot = true;
                }
                while(w < W){
                    if(dot){
                        System.out.print(".");
                        dot = false;
                    }
                    else{
                        System.out.print("#");
                        dot = true;
                    }
                    if(w == W-1){
                        System.out.println();
                    }
                    w++;
                }
                w=0;
                h++;
            }
            w = 0;
            h = 0;
            H = scan.nextInt();
            W = scan.nextInt();
            System.out.println();
        }
    }
}

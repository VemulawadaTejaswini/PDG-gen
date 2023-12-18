import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int w = 0;
        int h = 0;
        while(H != 0 && W != 0){
            while(h < H){
                while(w < W){
                    if(h ==0 || h == (H -1)){
                        System.out.println("#");
                    }
                    else{
                        if(w == 0|| w == (W -1)){
                            System.out.println("#");
                        }
                        else{
                            System.out.println(".");
                        }
                    }
                    w++;
                }
                h++;
            }
            w = 0;
            h = 0;
            H = scan.nextInt();
            W = scan.nextInt();
        }
    }
}

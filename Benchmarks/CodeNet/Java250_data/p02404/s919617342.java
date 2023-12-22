import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        loop: while(true){
            int w = sc.nextInt(),h = sc.nextInt();
            if(w == 0 && h == 0) break loop;
            for(int i = 0;i < w;i++){
                for(int j = 0;j < h;j++){
                    System.out.print((i == 0 || i == w - 1 || j == 0 || j == h - 1) ? "#" : ".");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
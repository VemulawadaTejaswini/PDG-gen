import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt(), w = sc.nextInt();
            if(h == 0 && w == 0) break;
            for(int i = 0; i < h; i++){
                for(int n = 0; n < w; n++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

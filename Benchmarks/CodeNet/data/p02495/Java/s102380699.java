import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int i,j,h,w;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        while(h != 0 && w != 0){
            for(i = 0; i < h; i++){
                for(j = 0; j < w; j++){
                    if(i % 2 == 1){
                        if(j % 2 == 1){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }else{
                        if(j % 2 == 1){
                            System.out.print(".");
                        }else{
                            System.out.print("#");
                        }
                    }
                }
                System.out.println("");
            }
            System.out.println("");
            h = sc.nextInt();
            w = sc.nextInt();
        }
    }
}
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    
 
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
 
        while(H != 0 || W != 0){
            if(H == 0 && W == 0){
                break;
            }
            for(int i = 0; i < H; i++) {
                if(i % 2 == 0){
                    for(int j = 0; j < W; j++) {
                        if(j % 2 == 0) {
                            System.out.print("#");
                        }else if(j % 2 == 1){
                            System.out.print(".");
                        }
                    }
                }else if(i % 2 == 1){
                    for(int j = 0; j < W; j++) {
                        if(j % 2 == 0) {
                            System.out.print(".");
                        }else if(j % 2 == 1){
                            System.out.print("#");
                        }
                    }
                }
                System.out.println("");
            }
            System.out.println("");
            H = sc.nextInt();
            W = sc.nextInt();
        }
 
    }
 
}

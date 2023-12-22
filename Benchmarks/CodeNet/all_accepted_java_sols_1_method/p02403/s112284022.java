import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while(true){
        int h = input.nextInt();
        int w = input.nextInt();
        if(h==0&&w==0){
            break;
        }
        for(int n = 0; n < h; n++){
        for(int i = 0; i < w; i++){
            System.out.print("#");
        }
        System.out.println();
        }
        System.out.println();
        }
    }
}
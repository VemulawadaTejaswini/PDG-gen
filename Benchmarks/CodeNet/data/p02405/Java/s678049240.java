
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);

        while(true){
            int h = scan.nextInt();
            int w = scan.nextInt();
            boolean b ;
            if(h == 0 && w == 0)break;
            for(int i = 0;i < h;i++){
                if(i % 2 == 0)b = true;
                else b = false;
                for(int j = 0;j < w;j++){
                    if(b){
                    System.out.print("#");
                    b = false;
                    }else{
                        System.out.print(".");
                        b = true;
                    }
                }
                System.out.println();
            }
            System.out.println();

        }

        scan.close();
    }

    

}

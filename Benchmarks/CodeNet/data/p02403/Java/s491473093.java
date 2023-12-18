import java.util.Scanner;

public class Main{
        public static void main(final String[] args){
            final Scanner sc = new Scanner(System.in);
            while(true){
                int height = sc.nextInt();
                int wideth = sc.nextInt();
                if(height + wideth == 0){
                    break;
                }
                for(int i = 0; i < height; i++){
                    for(int j = 0; j < wideth; j++){
                        System.out.printf("#");
                    }
                    System.out.printf("\n");
                }
                System.out.printf("\n");
            }
            sc.close();
        }
         

}

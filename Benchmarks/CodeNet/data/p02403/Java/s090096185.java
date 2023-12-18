import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(true){
            int H = scan.nextInt();
            int M = scan.nextInt();

            if(H==0&&M==0){
                break;
            }

            while(H-- > 0){
                for(int i=0;i<M;i++){
                    System.out.print("#");
                }
                System.out.println();
            }

            System.out.println();

        }


    }
}

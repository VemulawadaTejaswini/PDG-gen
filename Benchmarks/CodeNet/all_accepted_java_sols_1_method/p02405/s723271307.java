import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(true){

            int H = scan.nextInt();
            int M = scan.nextInt();
            int i,j;

            if(H==0&&M==0){
                break;
            }

            for(j=0;j<H;j++){
                for(i=0;i<M;i++){
                    if((i+j)%2==0){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            System.out.println();
            
        }
    }
}

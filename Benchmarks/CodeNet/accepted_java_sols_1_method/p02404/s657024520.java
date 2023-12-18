import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int H=sc.nextInt();
            int W=sc.nextInt();
            if(H==0 || W==0){
                break;
            }
            for(int x=0;x<W;x++){
                System.out.print("#");
            }
            System.out.println();
            for(int y=1;y<H-1;y++){
                System.out.print("#");
                for(int x=1;x<W-1;x++){
                System.out.print(".");
            }
                System.out.print("#");
                System.out.println();
            }
            for(int x=0;x<W;x++){
                System.out.print("#");
            }
            System.out.println();
            System.out.println();
        }
    }
}

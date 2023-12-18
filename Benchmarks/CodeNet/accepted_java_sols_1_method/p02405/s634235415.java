import java.util.Scanner;


public class Main {
    static   Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {
       int x,y;
        while(true){
            x=scan.nextInt(); y=scan.nextInt();
            if(x==0 && y==0){
                break;
            }
           
            for(int i=0; i<x;i++){
                for(int j=0; j<y; j++){
                   if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                       }
                    }else{
                        if(j%2==0){
                            System.out.print(".");
                        }else{
                            System.out.print("#");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        }
}

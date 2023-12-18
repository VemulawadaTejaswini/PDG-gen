import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H;
        int W;

        while (true) {
            H = sc.nextInt();
            W = sc.nextInt();
            if(H==0 && W==0){
                break;
            }
            int i;
            int j;
            for(i=0;i<H;i++){
                for(j=0;j<W;j++){
                    if(i%2==0){
                        if(j%2 == 0){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }        
                    }else{
                        if(j%2 == 0){
                            System.out.print(".");
                        }else{
                            System.out.print("#");
                        }
                    }
                }
                System.out.println("");
            }
        
        }
        sc.close();
    }
}

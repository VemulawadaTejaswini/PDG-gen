import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) {break;}
            if (W > 300 || H < 1){break;}
            for(int i=1;i<=H;i++){
                if(i%2==1){
                    for(int j=1;j<=W;j++){
                        if(j%2==1){
                            System.out.print("#");
                        }else if(j%2==0){
                            System.out.print(".");
                        }
                    }
                    System.out.println();

                }else if(i%2==0){
                    for(int j=1;j<=W;j++){
                        if(j%2==1){
                            System.out.print(".");
                        }else if(j%2==0){
                            System.out.print("#");
                        }
                    }
                    System.out.println();

                }
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 && W == 0){
                break;
            }   
            for(int i=1; i<=H; i++){
                if(i % 2 == 1){
                    if(W % 2 ==0){
                        for(int j=1; j<=W/2; j++){
                            System.out.printf("#.");
                        }
                    System.out.println();
                    }else{
                        for(int j=1; j<=(W-1)/2; j++){
                            System.out.printf("#.");
                        }
                    System.out.println("#");
                    }
                }else{
                    if(W % 2 ==0){
                        for(int j=1; j<=W/2; j++){
                            System.out.printf(".#");
                        }
                        System.out.println();
                    }else{
                        for(int j=1; j<=(W-1)/2; j++){
                            System.out.printf(".#");
                        }
                    System.out.println(".");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

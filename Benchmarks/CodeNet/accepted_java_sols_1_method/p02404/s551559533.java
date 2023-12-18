import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 && W == 0){
                break;
            }
            
            for(int i = 1 ; i <= W ; i++){
                System.out.print("#");
            }
            System.out.println();
            
            for(int i = 2 ; i <= H-1 ; i++ ){
                for(int j = 1 ; j <= W ; j++){
                    if(j == 1){
                        System.out.print("#");
                    } else if (j == W){
                        System.out.println("#");
                    } else {
                        System.out.print(".");
                    }
                }
            }
            
            for(int i = 1 ; i <= W ; i++){
                System.out.print("#");
            }
            System.out.println();
            System.out.println();
        }
    }
}

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H,W;
        while(true){
            H = sc.nextInt();
            W = sc.nextInt();
            if(H == 0 && W == 0){
                break;
            }
            else{
                for(int i = 1; i <= H; i++){
                    for(int n = 1; n <= W; n++){
                        if(i % 2 == 1){
                            if(n == W && n % 2 == 1 && i == H){
                                System.out.println("#\n");
                            }
                            else if(n == W && n % 2 == 0 && i == H){
                                System.out.println(".\n");
                            }
                            else if(n == W && n % 2 == 1){
                                System.out.print("#\n");
                            }
                            else if(n == W && n % 2 == 0){
                                System.out.print(".\n");
                            }
                            else if(n % 2 == 1){
                                System.out.print("#");
                            }
                            else{
                                System.out.print(".");
                            }
                        }
                        else{
                            if(n == W && n % 2 == 1 && i == H){
                                System.out.println(".\n");
                            }
                            else if(n == W && n % 2 == 0 && i == H){
                                System.out.println("#\n");
                            }
                            else if(n == W && n % 2 == 1){
                                System.out.print(".\n");
                            }
                            else if(n == W && n % 2 == 0){
                                System.out.print("#\n");
                            }
                            else if(n % 2 == 1){
                                System.out.print(".");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                    }
                }
            }
        }
    }
}


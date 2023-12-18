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
                for(int i = 0; i < H; i++){
                    for(int n = 0; n < W; n++){
                        if(i == 0 || i == H - 1){
                            if(i == H - 1 && n == W - 1){
                            System.out.println("#\n");
                            }
                            else if(n == W - 1){
                                System.out.print("#\n");
                            }
                            else{
                                System.out.print("#");
                            }
                        }else{
                        if(i == H - 1 && n == W - 1){
                            System.out.println("#\n");
                        }
                        else if(n == 0){
                            System.out.print("#");
                        }
                        else if(n == W - 1){
                            System.out.print("#\n");
                        }
                        else{
                            System.out.print(".");
                        }
                        }
                    }
                }
            }
        }
    }
}


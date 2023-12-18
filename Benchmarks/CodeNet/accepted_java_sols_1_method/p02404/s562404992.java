import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h, w;

        while(true){
            h = scanner.nextInt();
            w = scanner.nextInt();
            if(h == 0 && w == 0)break;
            for(int i = 0; i < h; i++){
                if(i == 0 || i == (h-1)){
                    for(int j = 0; j < w; j++){
                        System.out.print("#");
                    }
                }
                else{
                    for(int j = 0; j < w; j++){
                        if(j == 0 || j == w-1){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}


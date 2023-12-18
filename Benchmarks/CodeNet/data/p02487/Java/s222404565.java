import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
 
        while(h*w != 0){
            for(int i = 0;i<w;w++){
                System.out.printf("#");
            }
            System.out.printf("\n");

            for(int j=0;j<h-2;j++){
                System.out.printf("#");
                for(int k=0;k<w-2;w++){
                    System.out.printf(".");
                }
                System.out.printf("#");
                System.out.printf("\n");
            }
            for(int l = 0;l<w;l++){
                System.out.printf("#");
            }


        
        System.out.printf("\n");
            h = sc.nextInt();
            w = sc.nextInt();
        }
    }
}

    
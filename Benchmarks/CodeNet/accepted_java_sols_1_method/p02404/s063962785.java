import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int i,j;

        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(i = 0;i < x;i++){
                for(j = 0;j < y;j++){
                    if(i == 0 || j == 0 || i == x-1 || j == y-1){
                        System.out.printf("#");
                    }
                    else{
                        System.out.printf(".");
                    }
                }

                System.out.printf("\n");

            }

            if(x == 0 && y == 0)break;

            System.out.printf("\n");

        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] H, W;
        int i, j, k, count;

        H = new int[10000];
        W = new int[10000];

        i=0;
        while(true){
            if(i == 10000){break;}

            H[i] = sc.nextInt();
            W[i] = sc.nextInt();

            if(H[i] == 0 && W[i] == 0){break;}
            i++;
        }
        count = i;

        for(k=0;k<count;k++){

            for(j=0;j<W[k];j++){
                System.out.print("#");
            }

            System.out.println();

            for(i=1;i<H[k]-1;i++){

                System.out.print("#");
                for(j=1;j<W[k]-1;j++){
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.println();

            }

            for(j=0;j<W[k];j++){
                System.out.print("#");
            }

            System.out.println();
            System.out.println();
        }
    }

}


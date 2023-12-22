import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] H, W;
        int i, j, k, count;

        H = new int[100000];
        W = new int[100000];

        i=0;
        while(true){
            if(i == 100000){break;}

            H[i] = sc.nextInt();
            W[i] = sc.nextInt();

            if(H[i] == 0 && W[i] == 0){break;}
            i++;
        }
        count = i;

        for(k=0;k<count;k++){
            for(i=0;i<H[k];i++){
                for(j=0;j<W[k];j++){
                    if(i%2==0){
                        if(j%2==0){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }else{
                        if(j%2==0){
                            System.out.print(".");
                        }else{
                            System.out.print("#");
                        }
                    }

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


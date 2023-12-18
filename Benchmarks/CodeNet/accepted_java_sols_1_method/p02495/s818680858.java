import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int count=0;
        int count_h=0;
        int count_w=0;
 
        while(h*w != 0){
            for(int i =0;i<h*w;i++){
                if((count_h+count_w)%2==0){
                System.out.printf("#");
            }
            else{
                System.out.printf(".");

            }
            count_w++;
            if (count_w==w){
                count_w=0;
                count_h++;
                System.out.printf("\n");
            }

                }
            System.out.printf("\n");
            count_h=0;
            h = sc.nextInt();
            w = sc.nextInt();
            }


        }
    }


    
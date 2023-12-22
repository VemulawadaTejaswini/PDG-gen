

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N= scan.nextInt();
        int s = N%10;
        //System.out.println(N);
        if (s==3){
            System.out.println("bon");
        }else{
            if(s == 0 || s == 1 ||s == 6 ||s == 8){
                System.out.println("pon");
            }else{
                System.out.println("hon");
            }
        }

    }
}

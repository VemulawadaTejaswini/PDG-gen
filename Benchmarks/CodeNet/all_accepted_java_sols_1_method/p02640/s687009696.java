

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        for (int i=0;i<=100;i++){
            int crane=X-i;
            if (crane>=0){
                if (crane*2+i*4==Y){
                    System.out.println("Yes");
                    return;
                }
            }




        }
        System.out.println("No");
        return;


    }
}

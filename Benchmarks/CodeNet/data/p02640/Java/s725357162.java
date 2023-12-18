

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int legs=0;
        for (int i=1;i<=X;i++){
            if (Y%X!=0){
                legs+=4;
            }
            else if (Y%X==0){
                legs+=2;
            }
            if (legs==Y||legs>Y)break;
        }
        if (Y==legs){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=n%10;
        if(a==2 || a==4 || a==5 || a==7 || a==9){
            System.out.println("hon");
        }
        if(a==0 || a==1 || a==6 || a==8){
            System.out.println("pon");
        }
        if(a==3){
            System.out.println("bon");
        }
    }

}

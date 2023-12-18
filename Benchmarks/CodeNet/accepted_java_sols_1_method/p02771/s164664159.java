
import java.util.Scanner;

/**
 * @author : gaurav.ss
 * @since : 16/02/20
 **/
 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a==b && a!=c){
            System.out.println("Yes");
        }else
            if(a==c && a!=b){
                System.out.println("Yes");
            }else
                if(b==c && b!=a){
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");
    }
}

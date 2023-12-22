import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;

        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        if(n<=m){
            System.out.println("unsafe");
        }
        else {
            System.out.println("safe");
        }


    }


}


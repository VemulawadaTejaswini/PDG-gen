import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (int) Math.floor(a/3600);
        if((a - 3600*b) > 0){
            int c = (int)Math.floor((a-3600*b)/60);
            if(a-3600*b- c*60 > 0){
                int d = a-3600*b - c*60;
                System.out.println(b + ":" + c + ":" + d);
            }else{
                System.out.println(b + ":" + c + ":" + 0);
            }

        }else{
            System.out.println(b + ":" + 0 + ":" + 0);
        }

    }
}


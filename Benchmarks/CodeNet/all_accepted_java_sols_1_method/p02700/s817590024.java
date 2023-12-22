import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d,flag = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        while(flag == 0){
            if(count % 2 == 0){
                c -= b;
                if(c <= 0){
                    System.out.println("Yes");
                    flag = 1;
                }else{
                    a -= d;
                    if(a <= 0){
                        System.out.println("No");
                        flag = 1;
                    }
                }
            }

        }

    }
}
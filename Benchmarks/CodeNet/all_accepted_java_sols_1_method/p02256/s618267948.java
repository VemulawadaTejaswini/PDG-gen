import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r;
        while(true){
            if(x >= y){
                r = x % y;
                if(r == 0){
                    System.out.println(y);
                    break;
                }
                x = y;
                y = r;
            }else{
                r = y % x;
                if(r == 0){
                    System.out.println(x);
                    break;
                }
                y = x;
                x = r;
            }
        }
        sc.close();
    }
}

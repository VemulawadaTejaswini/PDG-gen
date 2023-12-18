import java.util.Scanner;
public class Main{
    public static int check(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        if(x1 == x2){
            if(x3 == x4)
                return 2;
            else if(y3 == y4)
                return 1;
            else
                return 0;
        }
        else if(x3 == x4){
            if(y1 == y2)
                return 1;
            else
                return 0;
        }
        else{
            if((double)(y2 - y1)/(x2 - x1) == (double)(y4 - y3)/(x4 - x3))
                return 2;
            else if((y1 - y2)*(y4 - y3) == (x2 - x1)*(x4 - x3))
                return 1;
            else
                return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();
            System.out.println(check(x1, y1, x2, y2, x3, y3, x4, y4));
        }
    }
}

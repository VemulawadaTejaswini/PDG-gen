import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int i = 1;
        while(true) {
            //CHECK_NUM:
            int x = i;
            int  END_CHECK_NUM=0;
            if (x % 3 == 0) {
                System.out.print(" " + i);
                //goto END_CHECK_NUM;
                END_CHECK_NUM=1;
            }
            while(END_CHECK_NUM==0) {
                //INCLUDE3:
                if (x % 10 == 3) {
                    System.out.print(" " + i);
                    break;
                }
                x /= 10;
                if (x==0)break;
            }
            //END_CHECK_NUM:
            if (++i > n) break;
            //if (++i <= n) goto CHECK_NUM;
        }
        System.out.println();
    }
}


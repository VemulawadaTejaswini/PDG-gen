import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int m, f, r, sum;
        Scanner scan = new Scanner(System.in);
        while(true){
            m = scan.nextInt();
            f = scan.nextInt();
            r = scan.nextInt();
            sum = m + f;
            if(m == -1 && f == -1 && r == -1) break;
            if(m == -1 || f == -1) System.out.printf("F\n");
            else if(sum >= 80) System.out.printf("A\n");
            else if(sum >= 65) System.out.printf("B\n");
            else if(sum >= 50) System.out.printf("C\n");
            else if(sum >= 30){
                if( r < 50) System.out.printf("D\n");
                else System.out.printf("C\n");
            }
            else if(sum < 30) System.out.printf("F\n");
        }
        scan.close();
    }
}


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();

            if(m == -1 && f == -1 && r == -1)break;
            if(m == -1 || f == -1 || (m + f) < 30)System.out.printf("F\n");
            else if((m + f) >= 80)System.out.printf("A\n");
            else if((m + f) >= 65 && (m + f) < 80)System.out.printf("B\n");
            else if(((m + f) >= 50 && (m + f) < 65) || ((m + f) >= 30 && (m + f) < 50 && r >= 50))System.out.printf("C\n");
            else if(((m + f) >= 30 && (m + f) < 50) || ((m + f) >= 30 && (m + f) < 50 && r < 50))System.out.printf("D\n");

        }
    }
}

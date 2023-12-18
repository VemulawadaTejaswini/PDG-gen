import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int i=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do {
            int x = i;
            if(x % 3 == 0) {
                System.out.print(" " + i);
            }
            else {
                x /= 10;
                if (x != 0) {
                    if (i % 10 == 3) System.out.print(" " + i);
                }
            }
        }while(++i <= n);
        System.out.println();

    }
}


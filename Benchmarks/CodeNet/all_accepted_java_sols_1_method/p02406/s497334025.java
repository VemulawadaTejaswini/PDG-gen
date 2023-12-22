import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if((i%3) == 0) System.out.printf(" %d", i);
            else if((i%10)==3) System.out.printf(" %d", i);
            else if((i/10)!=0 && ((i/10)%10)==3) System.out.printf(" %d", i);
            else if((i/10)!=0 && ((i/100)%10)==3) System.out.printf(" %d", i);
            else if((i/10)!=0 && ((i/1000)%10)==3) System.out.printf(" %d", i);
        }
        System.out.println();
    }
}


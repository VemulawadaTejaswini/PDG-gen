import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            while(true) {
                if (i % 3 == 0 || i % 10 == 3) {
                    System.out.printf(" %d", i);
                }
                if(i == 0) break;
                i /= 10;
            }
        }
        System.out.printf("\n");
    }
}


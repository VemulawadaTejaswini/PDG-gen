import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            if(i % 3 == 0 || i % 10 == 3) {
                System.out.printf(" %d", i);
            }
        }
        System.out.printf("\n");
    }
}


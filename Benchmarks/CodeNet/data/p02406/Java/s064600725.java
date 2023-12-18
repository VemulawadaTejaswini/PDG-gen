import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;// = new Scanner(System.in);
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=3; i<=n; i++){
            if(i%3==0 || i%10==3){
                System.out.print(" "+i);
                continue;
            }
            int x = i;
            while(x >= 10){
                x /= 10;
                if(x%10==3){
                    System.out.print(" "+i);
                    break;
                }
            }
        }
        System.out.println();

    }
}

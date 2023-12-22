import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int donuts = 4;
        int cake = 7;
        
        for(int i=donuts;i<=n;i+=donuts){
            if(i==n){
                System.out.print("Yes");
                System.exit(0);
            }
        }

        for(int i=cake;i<=n;i+=cake){
            if(i==n){
                System.out.print("Yes");
                System.exit(0);
            }
        }
        
        for(int i=donuts;i<=n;i+=donuts){
            for(int j=cake; j<=n;j+=cake){
                if(i + j == n){
                    System.out.print("Yes");
                    System.exit(0);
                }
            }
        }
        
        System.out.print("No");
    }
}
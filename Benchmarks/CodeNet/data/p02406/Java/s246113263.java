import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            int x = i;
            if(x % 3 == 0){
                System.out.print(" " + i);
                continue;
            }
            while(x > 0){
                boolean flag = false;
                if(x % 10 == 3){
                    System.out.print(" " + i);
                    flag = true;
                }
                if(flag)break;
                x /= 10;
            }
        }
        System.out.println("");
    }
}


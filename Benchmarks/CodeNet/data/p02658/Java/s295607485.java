import java.util.Scanner;
    
class Main {    
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = 1;
        while(n-- >0) {
            long ele = in.nextLong();
            if(ele ==0) {
                System.out.println("0");
                return ;
            }

            ans = ans*ele;
            if(ans > 1000000000000000000L || ans<0) {
                ans = -1; 
                break;
            }    
        }
        if(ans < 0) ans = -1;
        System.out.println(ans);
    }
}
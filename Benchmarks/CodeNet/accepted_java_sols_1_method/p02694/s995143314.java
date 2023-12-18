import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        long a = sc.nextLong(),ans = 0,num = 100;
        while(true){
            if(num >= a){
                System.out.println(ans);
                break;
            }  
            num += num/100;
            ans++;
        }
    }
}







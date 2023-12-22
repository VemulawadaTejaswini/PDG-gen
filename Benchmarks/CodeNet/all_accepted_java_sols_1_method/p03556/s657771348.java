import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        int ans=0;
        for (long i=N;i>0 ;i--){
            int a = (int)Math.sqrt(i);
            if(a*a == i){
                ans =(int)i;
                break;
            }
        }
        System.out.println(ans);
    }
}
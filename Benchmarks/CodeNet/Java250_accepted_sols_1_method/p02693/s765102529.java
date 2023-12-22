
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ad = 0;
        int ans = 0;
        sc.close();

        ad = a;
        for(int i=0 ; i<=(b-ad) ; i++){
            ans = (a%k==0)?1:0;
            if(ans == 1){break;}
            a++;
        }
        if(ans == 1){
            System.out.println("OK");
        }else{      
            System.out.println("NG");
        }
    }
}
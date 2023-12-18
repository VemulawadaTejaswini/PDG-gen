import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int low = in.nextInt(), high = in.nextInt(), x = in.nextInt();
        int cnt=0;

        for(int i = low; i <= high; i++){
            if(x % i == 0)cnt++;
        }

        System.out.println(cnt);
    }
}

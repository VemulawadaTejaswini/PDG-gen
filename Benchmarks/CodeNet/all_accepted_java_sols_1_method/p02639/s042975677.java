import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        for(int i=1; i<6; i++){
            int tmp = sc.nextInt();
            if(tmp==0){
                ans = i;
            }
        }
        
        System.out.println(ans);
    }
}

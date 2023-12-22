import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int d,ans;
        try (Scanner sc = new Scanner(System.in)){
            while(sc.hasNextInt()){
                d = sc.nextInt();
                ans = 0;
                for(int p=0;p<600;p+=d){
                    ans += d*p*p;
                }
                System.out.println(ans);
            }
        }
    }
}

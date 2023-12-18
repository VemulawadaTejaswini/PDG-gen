import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int d=sc.nextInt();
            int ans=0;
            for(int i=1;i*d<600;i++){
                ans+=i*i*d*d*d;
            }
            System.out.println(ans);
        }
    }
}
import java.util.*;

public class Main {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt(),ans=0;
        for(int i=1;i<=n;i++){
            String s=String.valueOf(i);
            if(s.length()%2==1) ans++;
        }
        System.out.println(ans);
    }

}

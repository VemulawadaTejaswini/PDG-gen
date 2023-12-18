import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(sc.next());
        int ans=0;
        for(int i=0;i<n;i++){
            String h=sc.next();
            h+=h;
            if(h.indexOf(s)!=-1)
                ans++;
        }
        System.out.println(ans);
    }
}
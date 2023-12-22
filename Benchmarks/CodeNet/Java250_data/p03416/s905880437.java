
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int ans=0;
        for(int i=a;i<=b;i++){
            if(iskaibun(i))ans++;
        }
        System.out.println(ans);
    }
    static boolean iskaibun(int in){
        String s=Integer.toString(in);
        boolean output=true;
        for(int i=0;i<s.length()/2;i++){
            output&=s.charAt(i)==s.charAt(s.length()-i-1);
        }
        return output;
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        
        int len=s.length();
        
        for(int i=0;i<len;i++){
            if(s.charAt(i)!=t.charAt(i)){
                System.out.println("No");
                return ;
            }
        }
        
        System.out.println("Yes");
    }
}

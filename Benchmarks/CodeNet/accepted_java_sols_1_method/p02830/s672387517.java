import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        String ans="";
        
        for(int i=0; i<n; i++){
            ans=ans+s1.charAt(i)+s2.charAt(i);
        }
        
        System.out.println(ans);
    }
}

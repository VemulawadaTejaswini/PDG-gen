import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        int hagi = 0;
        for(int i=0;i<n;i++){
            
            
            if(s.charAt(i) == 'I'){
                hagi++;
            } else {
                hagi--;
            }
            
            ans =  Math.max(ans,hagi);
        }
        System.out.println(ans);
    }        
}    
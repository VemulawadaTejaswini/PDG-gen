import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        String s = sc.next();
        
        int ans = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                count++;
                ans = Math.max(count, ans);
            }else{
                count = 0;
            }
        }
        System.out.println(ans);
    }
}
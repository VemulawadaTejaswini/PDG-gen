import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        
        int ans = 0;
        char c = '.';
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != c){
                ans++;
                c = s.charAt(i);
            }
        }
        
        System.out.println(ans);
    }
}
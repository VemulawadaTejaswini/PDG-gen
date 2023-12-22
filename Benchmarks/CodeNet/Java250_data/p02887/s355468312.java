import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char t = ' ';
        int ans = 0;
        for(int i=0;i<N;i++){
            char a = str.charAt(i); 
            if(a != t){
                ans++;
            }
            t = a;
        }
        System.out.println(ans);
    }
}

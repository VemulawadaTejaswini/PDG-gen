import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = N/1000;
        int ans = 0;
        if(N%1000!=0){
            ans = (result+1) * 1000 - N;
        }
        System.out.println(ans);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String result = "No";
        for(int i=0;i<=x;i++)
        {
            int ans = i*2  + (x-i) * 4;
            if(ans==y){
                result = "Yes";
            }
        }
        System.out.println(result);
    }
}
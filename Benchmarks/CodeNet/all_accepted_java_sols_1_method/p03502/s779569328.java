import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        for(String str : String.valueOf(n).split("")){
            sum += Integer.parseInt(str);
        }
        
        boolean ans = n % sum == 0 ? true : false;
        System.out.println(ans ? "Yes" : "No");
    }
}

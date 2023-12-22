import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] splitNum = num.split("", 0);
        
        int S_N = Integer.parseInt(num);
        int N = 0;
        for(int i = 0; i < num.length(); i++){
            N += Integer.parseInt(splitNum[i]);
        }
        
        System.out.println(S_N % N == 0 ? "Yes" : "No");
    }
}

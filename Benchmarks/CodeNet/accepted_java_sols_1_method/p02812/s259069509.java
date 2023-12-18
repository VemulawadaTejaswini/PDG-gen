import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S= sc.next();
        int result = 0;
        for(int i=0;i<N-2;i++){
            if(S.substring(i,i+3).equals("ABC")){
                result++;
            }
        }
        System.out.println(result);
    }
}

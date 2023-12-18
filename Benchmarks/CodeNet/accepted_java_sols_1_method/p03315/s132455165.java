import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int sum=0;
        for (int ct = 0; ct < str.length(); ct++) {
            if(str.charAt(ct)=='+'){
                sum++;
            }else{
                sum--;
            }
        }
        System.out.println(sum);
    }
}

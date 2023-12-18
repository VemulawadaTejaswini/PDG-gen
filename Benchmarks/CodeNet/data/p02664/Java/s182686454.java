import java.util.*;

public class Main {
    public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T.length(); i++) {
            switch(T.charAt(i)) {
                case '?':
                    sb.append('D');
                    break;
                default:
                    sb.append(T.charAt(i));
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}

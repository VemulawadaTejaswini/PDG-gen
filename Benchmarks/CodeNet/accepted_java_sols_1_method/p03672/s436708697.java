import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int stt = len % 2 == 0 ? 2 : 1;
        for(int i = stt; i < len; i += 2){
            String s1 = s.substring(0,len-i);
            String s2 = s1.substring(0,s1.length()/2);
            String s3 = s1.substring(s1.length()/2,s1.length());
            if(s2.equals(s3)){
                System.out.println(s1.length());
                break;
            }
        }
    }
}
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.print(read(num));
    }

    private static String read(long num) {
        if(num<=26) {
            char c = (char)(num+96);
            return String.valueOf(c);
        } else {
            long b = num%26;
            char c = (char)(b+96);
            num = num/26;

            if (b==0) {
                num -= 1;
                c = 'z';
            }
            return read(num) + c;
        }
    }

}
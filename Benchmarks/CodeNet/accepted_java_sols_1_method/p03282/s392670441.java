import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        
        char ans = '1';
        long oneIdx = 0;
        for(char str : s) {
            if(str != '1') {
                ans = str;
                break;
            }
            oneIdx++;
        }
        
        if(k <= oneIdx) ans = '1';
        System.out.println(ans);
    }
}

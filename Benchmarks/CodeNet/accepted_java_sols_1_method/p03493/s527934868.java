import java.util.Scanner;
/**
 *2018-04-08
 * https://beta.atcoder.jp/contests/abc081/tasks/abc081_a
**/
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

        for( int i=0; i<s.length();i++){
            if(s.charAt(i)=='1'){
                count ++;
            }
        }
        System.out.println(count);
    }
}

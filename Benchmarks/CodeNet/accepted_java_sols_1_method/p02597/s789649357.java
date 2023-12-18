import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        String s = stdIn.next();
        char[] cs = s.toCharArray();

        int l = 0;
        int r = n-1;
        int cnt = 0;
        while(l < r){
            if(cs[l] != 'W'){
                l++;
            }
            if(cs[r] != 'R'){
                r--;
            }
            if(l < r && cs[l] == 'W' && cs[r] == 'R'){
                cs[l] = 'R';
                cs[r] = 'W';
                cnt++;
                l++;
                r--;
            }
        }

        System.out.println(cnt);
    }
}
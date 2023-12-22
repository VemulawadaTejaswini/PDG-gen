import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        int cnt = 0;
        for(int i = 0; i < chars.length/2; i++){
            if( chars[i] == chars[chars.length-1-i] ){
                continue;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

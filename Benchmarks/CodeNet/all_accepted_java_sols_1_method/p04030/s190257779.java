import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next();
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'B'){
                if (sb.length() > 0){
                    sb.replace(sb.length()-1, sb.length(), "");
                }
            }
            else{
                if (s.charAt(i) == '1') sb.append("1");
                else if (s.charAt(i) == '0') sb.append("0");
            }
        }
        System.out.println(sb.toString());
    }
}